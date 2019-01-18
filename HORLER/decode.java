import java.util.*;
class decode{
    String str;
    long n ;
    int a,b,c=0,d,e,f=0;
    char ch ;
    void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the encoding for decoding");
        n= in.nextLong();
       System.out.println("Encoded message : ");
       System.out.println(n);
       System.out.println("The Decoded Message : ");
        while(n!=0){c=0;
            a= (int)(n%100);
            d= reverse(a);
            if(d==32){
                System.out.print(" ");
                n= n/100;
            }
            else if(d>64&&d<100){
                ch = (char)(d);
                System.out.print(ch);n=n/100;
                }
          else if(d<65){
              a=(int)(n%1000);
        d= reverse(a);if(d>99&&d<123){
        ch = (char)(d);
        System.out.print(ch);
        n= n/1000;}
    }
}}
int reverse(int a){
     if(a!=0){
                 b= a%10;
                c= c*10+b;
                reverse(a/10);}
                                    return c;
            }
public static void main(String[]args){
    decode sh = new decode();
    sh.input();
}}