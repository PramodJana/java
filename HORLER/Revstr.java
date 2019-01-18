import java.util.*;
class Revstr
{
   String Str ="", Revst="";
   
   void getStr()
   {
       Scanner kb=new Scanner(System.in );
       System.out.println("ENTER THE STRING");
       Str = kb.nextLine();
    }
    void check()
    {
         System.out.println("ORIGINAL STRING IS -->");
          System.out.println(Str);
          int l=Str.length();
          recReverse(l);
           System.out.println("ITS REVERSE IS -->");
            System.out.println(Revst);
            if(Str.equals(Revst))
            {
                 System.out.println("IT IS PALINDROME");
                }
                else
                {
                     System.out.println("IT IS NOT A PALINDROME");
                    }
                }
                void recReverse(int p)
                {
                    if(p==0)
                    {
                    }
                    else
                    {
                        Revst=Revst +Str.charAt(p-1);
                        recReverse(p-1);
                    }
                }
                public static void main()
                {
                    Revstr q = new Revstr();
                    q.getStr();
                    q.check();
                }
            }
            