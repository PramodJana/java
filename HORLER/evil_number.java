import java .util.*;
class evil_number
{
    long n,b;
    boolean flag=true;
    int con=0;
    void input()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        n=kb.nextLong();
    }
    void check()
    {
        long a , c=1,d,e=n;
        while(e!=0)
        {
            a=e%2;
            c=c*10+a;
            e=e/2;
        }
        while(c!=1)
        {
            d=c%10;
            if(d==1)
            {
                con++;
            }
            b=b*10+d;
            c=c/10;
        }
        if(con %2==0)
        {
            flag =true;
        }
    }
    void display()
    {
        System.out.println("INPUT : "+"\n"+n);
        System.out.println("OUTPUT :");
        System.out.println("BINARY EQUIVALENT :"+b);
        if(flag==true)
        {
            System.out.println("THE NUMBER IS A EVIL NUMBER");
        }
        else
        {
            System.out.println("THE NUMBER IS NOT A EVIL NUMBER");
        }
    }
    public static void main()
    {
        evil_number z=new evil_number();
        z.input();
z.check();
        z.display();
    }
}
