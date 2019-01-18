import java.util.*;
class vowelcomposite
{   char ch;
    String str , txt ="",rtxt="",nstr="";
    int v=0,c =0,w =0,wc,wv,i;
    int len;boolean flag = true;
    void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        str = in.nextLine()+ " ";
        System.out.println("<------------------------------------------------------------>");
        System.out.println("INPUT : ");
        System.out.println(str);
        i =0;
        len = str.length();}
        void check(){
            while(i<len){
            ch = str.charAt(i);
             if(ch==' '||ch==','||ch=='.'||ch=='?'){if(txt.equals("")!=true){
               
               int k =txt.length();
                  rtxt = casec(txt.charAt(0))+txt.substring(1,k);
               
                }if(ch==' '){
            nstr = nstr + rtxt +" " ;
        }else{
            nstr = nstr + rtxt;}
             
               rtxt ="";
                txt ="";
                 }
            else if(((int)ch>64&&(int)ch<91)||((int)ch>96&&(int)ch<123)){
                txt = txt + ch;
            }else{
                flag = false;
                
                break;}
            if(ch ==','||ch=='.'||ch=='?'){
                nstr = nstr +ch;}
            i++;
        
       }}
    
            
        void display(){
            System.out.println("OUTPUT :");
            if(flag==true){System.out.println(nstr);
             i=0;System.out.println();
             System.out.println("Word "+"\t"+"\t"+"Vowels "+"\t"+"\t"+ "Consonant ");
        while(i<len){
            ch = str.charAt(i);
             if(ch==' '||ch==','||ch=='.'||ch=='?'){if(txt.equals("")!=true){
                w = w+1;
               int k =txt.length();
                rtxt = casec(txt.charAt(0))+txt.substring(1,k);
                for(int p = 0 ; p< rtxt.length();p++){
                       char r = rtxt.charAt(p);
               if(r=='a'||r=='e'||r=='i'||r=='o'||r=='u'||r=='A'||r=='E'||r=='I'||r=='O'||r=='U'){
               wv = wv+1;
            }
            else{
               wc = wc+1;
            }
        }  System.out.println(rtxt+""+ "\t"+"\t"+wv+"\t" + "\t"+"  "+wc);
               
                txt ="";
                wc =0;
                wv =0;
            }}
            else{
                txt = txt + ch;
            }
                        i++;
        }}else{
            System.out.println("INVALID INPUT ");}
            System.out.println("<------------------------------------------------------------>");
       }
        
        char casec(char c){
            int h = (int)c;
            if(h>96&&h<123){
               h= h-32;}
            return (char)(h);}
       
             
    public static void main(String[]args){
        vowelcomposite s = new vowelcomposite();
        s.input();
        s.check();
        s.display();
    }
}
