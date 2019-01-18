import java. util.*;
class EVEN
{
    int a[]= new int[5];
    int i=0,large=0;
    Scanner kb = new Scanner(System.in);
    void input ()
    {
        System.out.println("ENTER 5 NUMBERS");
        for (int i=0; i<5;i++)
        {
            a[i]=kb.nextInt();
        }
        for (i=0;i<5;i++)
        if (a[i]!=0)
        {
            if(a[i]%2==0)
            {
                System.out.println(+a[i]);
            }
        }
    }
        public static void main (String []args)
        {
            EVEN P= new EVEN();
            P.input();
        }
    }
