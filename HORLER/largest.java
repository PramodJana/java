import java.lang.*;
import java.util.*;
class largest{
    String a = "", b = "",c;
    int len ,s, n,max = 0;
     char ch;
     int r;
    void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String");
        a = in.nextLine() + " ";
        len = a.length();s=0;
        int i;System.out.println("S.no" + "\t"+"\t"+"Word "+"\t"+"\t"+"size");
       for(i = 0;i<len;i++){
            ch = a.charAt(i);
            if(ch == ' '){ r = b.length();s++;
                if(max <r){
                max = r;
                c= b;
            }if(i!=len){
               System.out.println(s+"\t"+"\t"+b+"\t"+"\t"+r);
            }
        b = "";}
            else {
                b = b + ch;
        }
            
        }
        System.out.println("the largest word is " + c + " , it's length is " + max);
    }public static void main(String[]args){
        largest s = new largest();
        s.input();
    }
}