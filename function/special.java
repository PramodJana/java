import java.util.*;
class special
{
    int n;
    special()
    {
        n=0;
    }
    void special(int r)
    {
        n=r;
    }
    special(int a)
    {
        n=a;
    }
    void isspecial()
    {   int m=0;
        int z=n;
        while(z!=0)
        {int d=1;
            int temp =z%10;
            while(temp !=0)
            {
                d=d*temp;
                temp --;
            }
            m=m+d;
            z=z/10;
        }
        if(m==n)
        {
                System.out.println("THE NUMBER IS A SPECIAL NUMBER");
            }
            else
            {
                    System.out.println("IT IS NOT A SPECIAL NUMBER");
                }
            }
           public static void main()
           {Scanner kb = new Scanner(System.in);
               special p = new special();
                   System.out.println("ENTER THE NUMBER");
                   int k=kb.nextInt();
                   p.special(k);
                   p.isspecial();
                }
            }
