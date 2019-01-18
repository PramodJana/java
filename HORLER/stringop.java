import java.util.*;
import java.io.*;
class stringop 
{
    String txt;
    stringop()
    {
        txt= " ";
    }
    void readstring()
    {
        Scanner kb = new Scanner (System.in);
        System.out.println("ENTER THE STRING");
        txt = kb .nextLine();
    }
    void circulardecode()
    {
        int l= txt.length();
        StringBuffer st = new StringBuffer(txt);
        for (int i=0;i<l;i++)
        {
            char ch = st.charAt(i);
            int k =(int)ch;
            if (ch=='Z')
            {
                st.setCharAt(i,'A');
            }
            else if(ch=='z')
            {
                st.setCharAt(i,'a');
            }
            else
            {
                st.setCharAt(i,((char)(k+1)));
            }
        }
        for (int j=0;j<l;j++)
        {
            char a =st.charAt(j);
            int f= (int)a;
            char p = caseconvert(f);
            st.setCharAt(j,p);
        }
        String sat = new String(st);
        System.out.print(st);
    }
    char caseconvert(int z)
    {
        if ((z>64)&&(z<90))
        {
            z=z+32;
        return (char)z;
    }
    else
    {
        z=z-32;
        return (char)z;
    }
}
public static void main(String [] args)
{
    stringop q = new stringop();
    q.readstring();
    q.circulardecode();
}
}
