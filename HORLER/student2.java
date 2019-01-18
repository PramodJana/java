import java.util.*;
class student2
{
    int n ;
    String name[] = new String[100];
    int rno[]= new int[100];
    int tmarks[] = new int[100];
    int rank[] = new int[100];
    char grade[] = new char[100];
    void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of student :");
        n = in.nextInt();
        for(int i = 0; i<n;i++){
        System.out.println("Enter the name of student : "+(i+1));
        name[i] = in.next();
        System.out.println("Enter the roll no of student ");
        rno[i] = in.nextInt();
        System.out.println("Enter the marks of six subject ");
        int m1,m2,m3,m4,m5,m6;
        m1 = in.nextInt();
        m2 = in.nextInt();
        m3 = in.nextInt();
        m4 = in.nextInt();
        m5=in.nextInt();
        m6 = in.nextInt();
        tmarks[i] = m1+m2+m3+m4+m5+m6;
    }
    for(int i =0;i<n;i++){
        rank[i]=i+1;
    }
}void grading(){
    for(int i  = 0;i<n;i++){
        int g = tmarks[i]/6;
        if(g>=90){
            grade[i] = 'A';
        }else if(g>=80 &&g<=89){
            grade[i] = 'B';}
            else if(g>=70 &&g<=79){
            grade[i] = 'C';}
            else if(g>=60 &&g<=69){
            grade[i] = 'D';}
            else if(g>=40&&g<=59){
            grade[i] = 'E';}
        else{
        grade[i] = 'F';}}
        }void rank(){for(int j =0;j<n;j++){
             for(int i =0;i<n-1;i++){
                 if(tmarks[i]< tmarks[i+1]){
                     int tmp = rank[i];
                     rank[i] = rank[i+1];
                     rank[i+1]=tmp;
                    }}}
        }void display(){
            System.out.println("S no" +"\t"+"\t"+"Name "+"\t"+"\t"+"Roll No"+"\t"+"\t"+"Total Marks"+"\t"+"\t"+"Grade"+"\t"+"\t"+"Rank");
            for(int i = 0;i<n;i++){if(grade[i]!='F'){
                System.out.println((i+1)+"\t"+"\t"+name[i]+"\t"+"\t"+rno[i]+"\t"+"\t"+tmarks[i]+"\t"+"\t"+"\t"+grade[i]+"\t"+"\t"+rank[i]);
            }else{System.out.println((i+1)+"\t"+"\t"+name[i]+"\t"+"\t"+rno[i]+"\t"+"\t"+tmarks[i]+"\t"+"\t"+"\t"+grade[i]+"\t"+"\t"+"Fail");} }}
            public static void main(String[]args){
                student2 sh = new student2();
                sh.input();
                sh.grading();
                sh.rank();
                sh.display();
            }
        }