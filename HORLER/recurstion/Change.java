package recurstion;

import java.util.*;
class Change
{
    Scanner kb= new Scanner(System.in);
    String str="",newstr="";
    int len;
    Change()
    {
    }
     void inputword()
     {
         System.out.println("ENTER THE STRING");
         str=kb.nextLine();
         len=str.length();
         recchange(0);
        }
        char caseconvert(char ch)
        {
            int z=(int)ch;
            if((z>=65)&&(z<=90))
            {
                z=z+32;
            }
            else if((z>=96)&&(z<=122))
            {
                z=z-32;
            }
            else
            {
            }
            return (char)z;
        }
        int recchange(int n)
        {
            if(n==(len))
            {
                return 0;
            }
            else
            {
                newstr=newstr+caseconvert(str.charAt(n));
               return recchange(n+1);
            }
        }
        void display()
        {
             System.out.println("ORIGINAL STRING = "+str);
              System.out.println("MODIFIED STRING ="+newstr);
            }
            public static void main()
            {
                Change p= new Change();
                p.inputword();
                p.display();
            }
        }
        