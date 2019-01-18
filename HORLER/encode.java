import java.util.*;
class encode{
    String str,txt ="";
    long c =0 ;
    int a,b;
    void encode(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the word for encoding ");
        str = in.nextLine();
        int len = str.length();
        System.out.println("the length of string " + len);
         for(int i = len-1;i>=0;i--){
            a = (int)(str.charAt(i));
            while(a!=0){
                b= a%10;
                c= (long)(c*10+b);
                a  = a/10;            
            }}System.out.println("the encode code of " + str );
            System.out.println(c);
       }
          
        public static void main(String[]args){
            encode sh = new encode();
            sh.encode();
            
        }
    }