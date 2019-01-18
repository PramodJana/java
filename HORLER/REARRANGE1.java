import java.util.*;
class REARRANGE1
{ String str[];
    void input()
    {   String stp="";
        Scanner kb = new Scanner(System.in);
        System.out.println("ENTER THE STRING IN LOWERCASE");
        String st = kb.nextLine();
        int l = st.length();
        for(int i=0;i<l;l++)
        {
            char ch =st.charAt(i);
            if(ch =='.')
            {
                stp = stp+ch;
            }
            else
            {
                StringTokenizer data = new StringTokenizer(stp);
                int q = data.countTokens();
                String str[] =new String[q];
                for(int j=0;j<q;j++)
                {
                    str[j] = data.nextToken();
                }
                arrange(q);
            }
        }
    }
    void arrange(int q)
    {
        for(int i=0;i<q;i++)
        {
            for(int j=0;j<q;j++)
            {
                String a=str[i];
                String b=str[j];
                if(((a.length())>(b.length())))
                {
                    String tmp =str[i];
                    str[i]=str[j];
                    str[j]= tmp;
                }
            }
        }
        for(int i=0;i<q;i++)
        {
            System.out.print(" "+str [i]);
        }
    }
    public static void main()
    {
        REARRANGE1 W = new REARRANGE1();
        W.input();
    }
}

