import java.util.*;
class Kaprekar
{
    int p=0,q=0,d=0,freq=0;
    void input()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF P & Q");
        System.out.print("P : ");
        p=kb.nextInt();
        System.out.print("Q : ");
        q=kb.nextInt();
        if(p<q)
        {  System.out.println();
           System.out.println("OUTPUT ----------->");
           System.out.println("THE KAPREKAR NUMBER ARE ---->");
           for(int b=p;b<q;b++)
           {
               int k=iskaprekar(b);
               if(k==1)
               {
                   System.out.print(b);
                   freq++;
                }
            }
            System.out.println(" ");
            System.out.println("THE FREQUENCY OF KAPREKAR NUMBER ARE = "+freq);
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
    }
    int sumof(int b,int z)
    {int ten=10;
        int c=b;
        int su=0;
        for(int i=1;i<=z;i++)
        {
         ten=ten *10;
    }
        while(c>0)
        {
            int e =c%ten;
            su =su+e;
            e=e/ten;
        }return su;
    }
    int iskaprekar(int a)
    {
        int b=a,d=1;
        while(b>0)
        {
             d=d+1;
            b=b/10;
        }
        int power =a*a;
        int sum =sumof(power ,(d-1));
        if(sum==a)
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
        Kaprekar p= new Kaprekar();
        p.input();
    }
}
