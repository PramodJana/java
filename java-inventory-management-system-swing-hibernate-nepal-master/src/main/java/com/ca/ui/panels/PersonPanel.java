package com.ca.ui.panels;

import com.ca.db.model.Person;
import com.ca.db.service.DBUtils;
import com.gt.common.constants.Status;
import com.gt.common.utils.UIUtils;
import com.gt.uilib.components.AbstractFunctionPanel;
import com.gt.uilib.components.input.GTextArea;
import com.gt.uilib.components.table.BetterJTable;
import com.gt.uilib.components.table.EasyTableModel;
import com.gt.uilib.inputverifier.Validator;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.List;

public class PersonPanel extends AbstractFunctionPanel {
    String[] header = new String[]{"S.N.", "ID", "First Name", "Last Name", "Address", "District", "PhoneNumber"};
    JPanel formPanel = null;
    JPanel buttonPanel;
    Validator v;
    private JTextField firstnameFLD;
    private JTextField phoneNumberFLD;
    private GTextArea addressFLD;
    private JButton btnReadAll;
    private JButton btnNew;
    private JButton btnDeleteThis;
    private JButton btnSave;
    private JPanel upperPane;
    private JPanel lowerPane;
    private BetterJTable table;
    private EasyTableModel dataModel;
    private int editingPrimaryId = 0;
    private JButton btnModify;
    private JButton btnCancel;
    private JLabel lblDistrict;
    private JTextField txtDistrict;
    private JLabel lblLastName;
    private JTextField txtLastname;

    public PersonPanel() {
        /**
         * all gui components added from here;
         */
        JSplitPane splitPane = new JSplitPane();
        splitPane.setContinuousLayout(true);
        splitPane.setResizeWeight(0.2);
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        add(splitPane, BorderLayout.CENTER);
        splitPane.setLeftComponent(getUpperSplitPane());
        splitPane.setRightComponent(getLowerSplitPane());
        /**
         * never forget to call after setting up UI
         */
        init();
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        EventQueue.invokeLater(() -> {
            try {
                JFrame jf = new JFrame();
                PersonPanel panel = new PersonPanel();
                jf.setBounds(panel.getBounds());
                jf.getContentPane().add(panel);
                jf.setVisible(true);
                jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    @Override
    public final void init() {
        /* never forget to call super.init() */
        super.init();
        UIUtils.clearAllFields(upperPane);
        changeStatus(Status.NONE);
    }

    private JPanel getButtonPanel() {
        if (buttonPanel == null) {
            buttonPanel = new JPanel();
            btnReadAll = new JButton("Read All");
            btnReadAll.addActionListener(e -> {
                readAndShowAll(true);
                changeStatus(Status.READ);
            });
            buttonPanel.add(btnReadAll);

            btnNew = new JButton("New");
            btnNew.addActionListener(e -> changeStatus(Status.CREATE));
            buttonPanel.add(btnNew);

            btnDeleteThis = new JButton("Delete This");
            btnDeleteThis.addActionListener(e -> {
                if (editingPrimaryId > 0) handleDeleteAction();
            });

            btnModify = new JButton("Modify");
            btnModify.addActionListener(e -> {
                if (editingPrimaryId > 0) changeStatus(Status.MODIFY);
            });
            buttonPanel.add(btnModify);
            buttonPanel.add(btnDeleteThis);

            btnCancel = new JButton("Cancel");
            btnCancel.addActionListener(e -> changeStatus(Status.READ));
            buttonPanel.add(btnCancel);
        }
        return buttonPanel;
    }

    private void handleDeleteAction() {
        switch (status) {
            case READ:
                deleteSelectedBranchOffice();
                break;
            default:
                break;
        }

    }

    private void deleteSelectedBranchOffice() {
        try {
            DBUtils.deleteById(Person.class, editingPrimaryId);
            changeStatus(Status.READ);
            JOptionPane.showMessageDialog(null, "Deleted");
            readAndShowAll(false);
        } catch (Exception e) {
            handleDBError(e);
        }
    }

    @Override
    public final void enableDisableComponents() {
        switch (status) {
            case NONE:
                UIUtils.toggleAllChildren(buttonPanel, false);
                UIUtils.toggleAllChildren(formPanel, false);
                UIUtils.clearAllFields(formPanel);
                btnReadAll.setEnabled(true);
                btnNew.setEnabled(true);
                table.setEnabled(true);
                break;
            case CREATE:
                UIUtils.toggleAllChildren(buttonPanel, false);
                UIUtils.toggleAllChildren(formPanel, true);
                table.setEnabled(false);
                btnCancel.setEnabled(true);
                btnSave.setEnabled(true);
                break;
            case MODIFY:
                UIUtils.toggleAllChildren(formPanel, true);
                UIUtils.toggleAllChildren(buttonPanel, false);
                btnCancel.setEnabled(true);
                btnSave.setEnabled(true);
                table.setEnabled(false);
                break;

            case READ:
                UIUtils.toggleAllChildren(formPanel, false);
                UIUtils.toggleAllChildren(buttonPanel, true);
                UIUtils.clearAllFields(formPanel);
                table.clearSelection();
                table.setEnabled(true);
                editingPrimaryId = -1;
                btnCancel.setEnabled(false);
                break;

            default:
                break;
        }
    }

    @Override
    public final void handleSaveAction() {
        switch (status) {
            case CREATE:
                // create new
                save(false);
                break;
            case MODIFY:
                // modify
                save(true);
                break;

            default:
                break;
        }
    }

    private void initValidator() {

        if (v != null) {
            v.resetErrors();
        }

        v = new Validator(mainApp, true);
        v.addTask(firstnameFLD, "Req", null, true);
        v.addTask(addressFLD, "", null, true);

    }

    private Person getModelFromForm() {
        Person bo = new Person();
        bo.setFirstName(firstnameFLD.getText().trim());
        bo.setLastName(txtLastname.getText().trim());
        bo.setAddress(addressFLD.getText().trim());
        bo.setPhoneNumber(phoneNumberFLD.getText().trim());
        bo.setDistrict(txtDistrict.getText().trim());
        bo.setdFlag(1);
        return bo;
    }

    private void setModelIntoForm(Person bro) {
        firstnameFLD.setText(bro.getFirstName());
        txtLastname.setText(bro.getLastName());
        addressFLD.setText(bro.getAddress());
        phoneNumberFLD.setText(bro.getPhoneNumber());
        txtDistrict.setText(bro.getDistrict());
    }

    private void save(boolean isModified) {
        initValidator();
        if (v.validate()) {
            try {

                Person newBo = getModelFromForm();
                if (isModified) {
                    Person bo = (Person) DBUtils.getById(Person.class, editingPrimaryId);
                    bo.setAddress(newBo.getAddress());
                    bo.setFirstName(newBo.getFirstName());
                    bo.setLastName(newBo.getLastName());
                    bo.setPhoneNumber(newBo.getPhoneNumber());
                    bo.setDistrict(newBo.getDistrict());
                    DBUtils.saveOrUpdate(bo);
                } else {
                    DBUtils.saveOrUpdate(newBo);
                }
                JOptionPane.showMessageDialog(null, "Saved Successfully");
                changeStatus(Status.READ);
                UIUtils.clearAllFields(upperPane);
                readAndShowAll(false);
            } catch (Exception e) {
                handleDBError(e);
            }
        }
    }

    private JPanel getUpperFormPanel() {
        if (formPanel == null) {
            formPanel = new JPanel();

            formPanel.setBorder(new TitledBorder(null, "Person Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
            formPanel.setBounds(10, 49, 474, 135);
            formPanel.setLayout(new FormLayout(new ColumnSpec[]{
                    FormFactory.RELATED_GAP_COLSPEC,
                    FormFactory.DEFAULT_COLSPEC,
                    FormFactory.RELATED_GAP_COLSPEC,
                    FormFactory.DEFAULT_COLSPEC,
                    FormFactory.RELATED_GAP_COLSPEC,
                    FormFactory.DEFAULT_COLSPEC,
                    FormFactory.RELATED_GAP_COLSPEC,
                    ColumnSpec.decode("left:default"),
                    FormFactory.RELATED_GAP_COLSPEC,
                    ColumnSpec.decode("left:default"),},
                    new RowSpec[]{
                            FormFactory.RELATED_GAP_ROWSPEC,
                            FormFactory.DEFAULT_ROWSPEC,
                            FormFactory.RELATED_GAP_ROWSPEC,
                            FormFactory.DEFAULT_ROWSPEC,
                            FormFactory.RELATED_GAP_ROWSPEC,
                            RowSpec.decode("max(32dlu;default)"),
                            FormFactory.RELATED_GAP_ROWSPEC,
                            FormFactory.DEFAULT_ROWSPEC,
                            FormFactory.RELATED_GAP_ROWSPEC,
                            FormFactory.DEFAULT_ROWSPEC,}));

            JLabel lblN = new JLabel("First Name");
            formPanel.add(lblN, "4, 2");

            firstnameFLD = new JTextField();
            formPanel.add(firstnameFLD, "8, 2, fill, default");
            firstnameFLD.setColumns(10);

            lblLastName = new JLabel("Last Name");
            formPanel.add(lblLastName, "4, 4");

            txtLastname = new JTextField();
            formPanel.add(txtLastname, "8, 4, fill, default");
            txtLastname.setColumns(10);

            JLabel lblAddress = new JLabel("Address");
            formPanel.add(lblAddress, "4, 6, default, top");

            addressFLD = new GTextArea(5, 40);
            formPanel.add(addressFLD, "8, 6, fill, fill");

            lblDistrict = new JLabel("District");
            formPanel.add(lblDistrict, "4, 8");

            txtDistrict = new JTextField();
            formPanel.add(txtDistrict, "8, 8, fill, default");
            txtDistrict.setColumns(10);

            JLabel lblPhoneNumber = new JLabel("Phone Number");
            formPanel.add(lblPhoneNumber, "4, 10");

            phoneNumberFLD = new JTextField();
            formPanel.add(phoneNumberFLD, "8, 10, fill, default");
            phoneNumberFLD.setColumns(10);

            btnSave = new JButton("Save");
            btnSave.addActionListener(e -> {
                btnSave.setEnabled(false);
                handleSaveAction();
                btnSave.setEnabled(true);
            });
            formPanel.add(btnSave, "10, 10");
        }
        return formPanel;
    }

    private void readAndShowAll(boolean showSize0Error) {
        try {
            List<Person> brsL = DBUtils.readAll(Person.class);
            editingPrimaryId = -1;
            if (brsL == null || brsL.size() == 0) {
                if (showSize0Error) {
                    JOptionPane.showMessageDialog(null, "No Records Found");
                }
                return;
            }
            showBranchOfficesInGrid(brsL);
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

    private void showBranchOfficesInGrid(List<Person> brsL) {
        dataModel.resetModel();
        int sn = 0;
        for (Person bo : brsL) {
            dataModel.addRow(new Object[]{++sn, bo.getId(), bo.getFirstName(), bo.getLastName(), bo.getAddress(), bo.getDistrict(), bo.getPhoneNumber()});
        }
        // table.setTableHeader(tableHeader);
        table.setModel(dataModel);
        dataModel.fireTableDataChanged();
        table.adjustColumns();
        editingPrimaryId = -1;
    }

    @Override
    public final String getFunctionName() {
        return "New Person";
    }

    private JPanel getUpperSplitPane() {
        if (upperPane == null) {
            upperPane = new JPanel();
            upperPane.setLayout(new BorderLayout(0, 0));
            upperPane.add(getUpperFormPanel(), BorderLayout.CENTER);
            upperPane.add(getButtonPanel(), BorderLayout.SOUTH);
        }
        return upperPane;
    }

    private JPanel getLowerSplitPane() {
        if (lowerPane == null) {
            lowerPane = new JPanel();
            lowerPane.setLayout(new BorderLayout());
            dataModel = new EasyTableModel(header);

            table = new BetterJTable(dataModel);
            table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            JScrollPane sp = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

            lowerPane.add(sp, BorderLayout.CENTER);
            table.getSelectionModel().addListSelectionListener(e -> {
                int selRow = table.getSelectedRow();
                if (selRow != -1) {
                    /**
                     * if second column doesnot have primary id info, then
                     */
                    int selectedId = (Integer) dataModel.getValueAt(selRow, 1);
                    populateSelectedRowInForm(selectedId);
                }
            });
        }
        return lowerPane;
    }

    protected final void populateSelectedRowInForm(int selectedId) {
        try {
            Person bro = (Person) DBUtils.getById(Person.class, selectedId);
            if (bro != null) {
                setModelIntoForm(bro);
                editingPrimaryId = bro.getId();
            }
        } catch (Exception e) {
            handleDBError(e);
        }

    }

}
