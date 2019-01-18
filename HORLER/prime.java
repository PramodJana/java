import java.util.*;
class prime
{ int n,a=0,b=0,c;
    void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value");
        n = in.nextInt();
        c=n;
        while(n!=0){
            a= n%10;
            b= b*10 + a;
            n= n/10;
        }System.out.println("the reverse of input :"+b);
        if(b==c){
            System.out.println("the given input is palindrome ");} 
    }public static void main(String[]args){
        prime s = new prime();
        s.input();
    }
}