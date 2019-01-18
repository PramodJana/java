package year_2014;


import java.util.*;
class CompositeMagic
{
    Scanner kb = new Scanner(System.in);
    int m ,n;
    void input()
    {
        System.out.println("INPUT : ");
        System.out.print("m = ");
        m=kb.nextInt();
        System.out.println("");
        System.out.print("n = ");
        n=kb.nextInt();
        System.out.println("");
        int k=0;
        System.out.println("OUTPUT : ");
        
      if(m<=n)
      {System.out.println("THE COMPOSITE MAGIC NUMBERS ARE : ");
          for(int i=m;i<=n;i++)
        {
            int a= magic (i);
            int b=composite(i);
            if((a==1)&&(b==1))
            {
                System.out.print(+i +" ");
                k++;
            }
        }System.out.println("");
        System.out.println("FREQUENCY OF COMPOSITE MAGIC NUMBER IS : "+k);
    }else
    {
        System.out.println("INVALID INPUT");
    }
}
    int magic(int p)
    {  int sum =0;
        int n=p;
        while(n!=0)
        {
            int d=n%10;
             sum=sum+d;
             n=n/10;
            }
            while(sum >9)
            {
                int num =sum;
                sum =digit(num);
            }
            if (sum ==1)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        int digit(int q)
        {int d=0;
            while(q!=0)
            {
                int temp =q%10;
                d=d+temp;
                q=q/10;
            }return d;
        }
        int composite(int r)
        {  int z=0;
            for(int i=1;i<=r;i++)
            {
                if(r%i ==0)
                {
                    z++;
                }
            }
            if(z==2)
            {
                return 0;
            }
            else{
                return 1;
            }
        }
        public static void main()
        {
            CompositeMagic pramod = new CompositeMagic();
            pramod .input();
        }
    }
    