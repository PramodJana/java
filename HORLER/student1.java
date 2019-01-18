import java.util.*;
class student1
{
    int n ;
    String name;
    int rno, tmarks;
    char grade;
    void input(){
        Scanner in = new Scanner(System.in);
       
        System.out.println("Enter the name of student : ");
        name= in.next();
        System.out.println("Enter the roll no of student ");
        rno = in.nextInt();
        System.out.println("Enter the marks of four subject ");
        int m1,m2,m3,m4;
        m1 = in.nextInt();
        m2 = in.nextInt();
        m3 = in.nextInt();
        m4 = in.nextInt();
        tmarks = m1+m2+m3+m4;
    
}void grading(){
   
        int g = tmarks/4;
        if(g>=90){
            grade = 'A';
        }else if(g>=80 &&g<=89){
            grade = 'B';}
            else if(g>=70 &&g<=79){
            grade = 'C';}
            else if(g>=60 &&g<=69){
            grade = 'D';}
            else {
            grade = 'E';}}
        void display(){
                   
                System.out.println(name+"\t"+"\t"+rno+"\t"+"\t"+tmarks+"\t"+"\t"+"\t"+grade);
            }
            public static void main(String[]args){
                student1 s1 = new student1();
                student1 s2 = new student1();
                student1 s3 = new student1();
                System.out.println("Enter the Information of 1st student");
                s1.input();
                s1.grading();
                 System.out.println("Enter the Information of 2nd student");
                s2.input();
                s2.grading();
                 System.out.println("Enter the Information of 3rd student");
                 s3.input();
                 s3.grading();
                  System.out.println("Name "+"\t"+"\t"+"Roll No"+"\t"+"\t"+"Total Marks"+"\t"+"\t"+"Grade");
                s1.display();
                s2.display();
                s3.display();
            }
        }