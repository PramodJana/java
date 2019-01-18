import java .util.*;
class Palindrome
{
    int c=0;
    
    void input()
    {  
        String str="";
        String nstr;
        Scanner kb= new Scanner(System.in);
        System.out.println("ENTER THE SENTENCE");
        str = kb.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        int len = st.countTokens();
        for (int i=0;i<len;i++)
        {
            nstr= st.nextToken();
            int p = ispalindrome(nstr);
       if(p==1)
       {
           System.out.println(nstr);
            c++;
        }
        
    }
    System.out.println("TOTAL NUMBER OF PALINDROME IN THE SENTENCE IS  =" +c);
}
             int ispalindrome(String w)
            {   String z= "";
                String o=w;
                int q = o.length();
                for (int k=q-1;k>-1;k--)
                {
                    char ch = o.charAt(k);
                     z = z+ch;
                }
                if(z.equals(w))
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
            public static void main()
            { 
                Palindrome t = new Palindrome();
                t.input();
        }
    }