import java.util.*;
class mencode{
    String str,rstr,txt ="";
    long c =0 ;
    int a,b,d = 0;
    long e[] = new long[100];
    void encode(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the word for encoding ");
        str = in.nextLine();
        int len = str.length();
        rstr = str + " ";
        System.out.println("the length of string " + len); for(int j = 0;j<=len;j++){
           char ch = rstr.charAt(j);
            if(ch ==' '){ for(int i = txt.length()-1;i>=0;i--){
            a = (int)(txt.charAt(i));
            while(a!=0){
                b= a%10;
                c= (long)(c*10+b);
                a  = a/10;
            
            }}System.out.println("the encode code of " + txt+ " : " );
            System.out.println(c);
            e[d++] = c;
            txt = "";if(j != len){
               c=0;}
            }
            else {
                txt = txt + ch;
        }
    } System.out.println("the encoding of " + str +" is ");
            for(int k = d-1 ;k>=0;k--)
            { System.out.print("23");
                System.out.print(e[k]);
            if(k!=0){
            System.out.print("23");}}
        
    
       }
          
        public static void main(String[]args){
            mencode sh = new mencode();
            sh.encode();
            
        }
    }