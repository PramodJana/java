import java.util.*;
class cvowels
{   char ch;
    String str , txt ="";
    int v=0,c =0,w =0,wc,wv,s,sp;
    int len;
    void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The String");
        str = in.nextLine();
        int i =0;str = str + " ";
        len = str.length();System.out.println("S.no" + "\t"+"Word "+"\t"+"\t"+"size"+ "\t"+"\t"+"Vowels "+"\t"+"\t"+ "Consonant ");
        while(i<len){
            ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                v = v+1;
            }
            else if(ch == ' '){sp =sp +1;}
            else{
                c = c+1;
            }
            if(ch==' '){
                w = w+1;
                s= txt.length();
                for(int p = 0 ; p<s;p++){
                       char r = txt.charAt(p);
               if(r=='a'||r=='e'||r=='i'||r=='o'||r=='u'||r=='A'||r=='E'||r=='I'||r=='O'||r=='U'){
               wv = wv+1;
            }
            else{
               wc = wc+1;
            }
        }
                System.out.println(w +" \t"+txt+""+"\t"+"\t"+s+ "\t"+ "\t"+wv+"\t" + "\t"+"  "+wc);
                 txt ="";
                wc =0;
                wv =0;
            }
            else{
                txt = txt + ch;
            }
            i++;
        } System.out.println();
        System.out.println("The Total Number Of Words Are : "+"\n" +w);
        System.out.println("The Total Number Of Consonant Are :"+ "\n" +c);
        System.out.println("The Total Number Of Vowels Are : "+"\n" + v);
        System.out.println("The Total Number Of Spaces Are : "+"\n" + (sp-1));}
             
    public static void main(String[]args){
        cvowels s = new cvowels();
        s.input();
    }
}