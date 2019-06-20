import java.util.*;
import java.io.*;
class test1
{
	public static void main(String[] args)
	{	
		if((args.length==1)&&(Integer.parseInt(args[0])>1000)&&(Integer.parseInt(args[0])<1008))
		{
			int key=Integer.parseInt(args[0])-1001;
			int EmpNo[]={1001,1002,1003,1004,1005,1006,1007};
			String EmpName[]={"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
			char DesignationCode[]={'e','c','k','r','m','e','c'};
			String Department[]={"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
			int Basic[]={20000,30000,10000,12000,50000,23000,29000};
			int HRA[]={800,12000,8000,6000,20000,9000,12000};
			int IT[]={3000,9000,1000,2000,20000,4400,10000};
			
			String designation=fullform(DesignationCode[key]);
			int salary=Basic[key]+HRA[key]+DA(DesignationCode[key])-IT[key];

			System.out.println("Emp No."+"\t\t"+"Emp Name"+"\t\t"+"Department"+"\t\t"+"Designatiom"+"\t\t"+"Salary");
			System.out.println(EmpNo[key]+"\t\t"+EmpName[key]+"\t\t"+Department[key]+"\t\t"+designation+"\t\t"+salary);
		}
		else
		{
			if(args.length==1)
			System.out.println("There is no employee with empid : "+args[0]);
		}
	}


	public static int DA(char c)
	{	int res=0;
		switch(c)
		{
			case 'e':
				res=20000;
				break;
			case 'c':
				res=32000;
				break;
			case 'k':
				res=12000;
				break;
			case 'r':
				res=15000;
				break;
			case 'm':
				res=40000;
				break;
		}
		return res;
	}

	public static String fullform(char c)
	{	String str="";
		switch(c)
		{
			case 'e':
				str="Engineer";
				break;
			case 'c':
				str="Consultant";
				break;
			case 'k':
				str="Clerk";
				break;
			case 'r':
				str="Receptionist";
				break;
			case 'm':
				str="Manager";
				break;
		}
		return str;
	}
}
