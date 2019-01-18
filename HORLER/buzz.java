import java.util.*;
class buzz
{   int a,b,c;
    
    Scanner kb = new Scanner(System.in);
    void input()
    {
        System.out.println("ENTER THE NUMBER");
        a= kb.nextInt();
        if (a>0)
        {
            b=a%10;
            c=a/7;
            a=a/10;
        }
        if((b==7)&&(c==0))
        {
            System.out.println("IT IS A BUZZ NUMBER");
        }
        else
        {
              System.out.println("IT IS not A BUZZ NUMBER");
            }
        }
        public static void main()
        {
             buzz m = new buzz();
              m.input();
            }
        }
