import java.util.*;
class largest1
{  
    
    public static void main(String[]args)
    {  String nstr = "";
        int large =0;
        Scanner kb = new Scanner(System.in);
        System.out.println("ENTER THE SENTENCE");
         String str = kb.next();
        int len = str.length();
       for(int i=0;i<len;i++)
       {
           char ch = str.charAt(i);
           if(ch!= ' ')
           { 
               nstr = nstr +ch;
               
    }
    else
    {
        int p=nstr.length();
        if(p>large)
        {
            large= p;
         
        }   nstr = "";
    }
}
System.out.println("THE LARGEST WORD IS "+ large);
}
}
