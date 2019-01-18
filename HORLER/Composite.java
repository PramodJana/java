import java.util.*;
class Composite
{
    int m,n,sum ,freq =0;
    void input()
    {
        Scanner kb = new Scanner(System.in);
          System.out.println("enter the range");
          int a =kb.nextInt();
          for(int i=0;i<=a;i++)
         {   int z =iscomposite(i);
             if(z==1)
             {
                 freq ++;
                }
            }
            
         System.out.println("FREQUENCY = "+freq);
        
}
public static void main()
{
    Composite p = new Composite();
    p.input();
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
}
