import java.util.*;
class student
{
    int n ;
    String name[] = new String[100];
    int rno[]= new int[100];
    int tmarks[] = new int[100];
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
        System.out.println("Enter the marks of four subject ");
        int m1,m2,m3,m4;
        m1 = in.nextInt();
        m2 = in.nextInt();
        m3 = in.nextInt();
        m4 = in.nextInt();
        tmarks[i] = m1+m2+m3+m4;
    }
}void grading(){
    for(int i  = 0;i<n;i++){
        int g = tmarks[i]/4;
        if(g>=90){
            grade[i] = 'A';
        }else if(g>=80 &&g<=89){
            grade[i] = 'B';}
            else if(g>=70 &&g<=79){
            grade[i] = 'C';}
            else if(g>=60 &&g<=69){
            grade[i] = 'D';}
            else {
            grade[i] = 'E';}}
        }void display(){
            System.out.println("S no" +"\t"+"\t"+"Name "+"\t"+"\t"+"Roll No"+"\t"+"\t"+"Total Marks"+"\t"+"\t"+"Grade");
            for(int i = 0;i<n;i++){
                System.out.println((i+1)+"\t"+"\t"+name[i]+"\t"+"\t"+rno[i]+"\t"+"\t"+tmarks[i]+"\t"+"\t"+"\t"+grade[i]);
            }}
            public static void main(String[]args){
                student sh = new student();
                sh.input();
                sh.grading();
                sh.display();
            }
        }