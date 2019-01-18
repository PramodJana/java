import java.util.*;
class vowels
{   char ch;
    String str , txt ="";
    int v=0,c =0,w =0,wc,wv;
    int len;
    void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        str = in.nextLine()+ " ";
        int i =0;
        len = str.length();
        while(i<len){
            ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                v = v+1;
            }
            else{
                c = c+1;
            }
            if(ch==' '){
                w = w+1;
                System.out.println("Word "+w+" : "+"\n"+ "'" +txt+ "'");
                for(int p = 0 ; p< txt.length();p++){
                       char r = txt.charAt(p);
               if(r=='a'||r=='e'||r=='i'||r=='o'||r=='u'||r=='A'||r=='E'||r=='I'||r=='O'||r=='U'){
               wv = wv+1;
            }
            else{
               wc = wc+1;
            }
        }
                System.out.println("No of Vowels : "+"\n" +wv);
                System.out.println("No of Consonant : "+"\n"+wc);
                txt ="";
                wc =0;
                wv =0;
            }
            else{
                txt = txt + ch;
            }
            i++;
        }
        System.out.println("The Total Number Of Words Are : "+"\n" +w);
        System.out.println("The Total Number Of consonant Are :"+ "\n" +c);
        System.out.println("The Total Number Of vowels Are : "+"\n" + +v);}
       
             
    public static void main(String[]args){
        vowels s = new vowels();
        s.input();
    }
}