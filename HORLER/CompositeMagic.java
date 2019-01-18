import java.util.*;
class CompositeMagic
{
    int m,n,sum =0,freq =0;
    void input()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF M&N");
        m=kb.nextInt();
        n=kb.nextInt();
        if(m<n)
        {
            System.out.println("THE COMPOSITE MAGIC NUMBERS ARE---->");
            for(int i=m;i<=n;i++)
            {
                int p=i;
                int q=i;
                int a=ismagic(p);
                int b=iscomposite(p);
                if((a==1)&&(b==1))
                {
                    System.out.println(i+" ");
                    freq++;
                }
            }
                System.out.println("THE FREQUENCY OF COMPOSITE MAGIC NUMBER IS ="+freq);
            
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
    }
    int ismagic(int n)
    {
        int num;
        int sum =sumof(n);
        while(sum>9)
        {
            num=sum;
            sum=sumof(num);
        }
        if(sum==1)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    int sumof(int num)
    {
        int d=0,sum=0;
        while(num>0)
        {
            d=num%10;
            sum=sum+d;
            num=num/10;
        }
        return sum;
    }
    int iscomposite(int a)
    {
        int i=2,sum=0;
        while(i<=a)
        {
            if(a%i==0)
            {
                sum=sum+1;
            }
            i++;
        }
        if(sum>=2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String []args)
    {
        CompositeMagic q=new CompositeMagic();
        q   .input();
    }
}

