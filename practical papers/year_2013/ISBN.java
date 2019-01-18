package year_2013;

import java.util.*;
class ISBN
{
    Scanner kb = new Scanner(System.in);
    int A[] = new int[10];
    int n,sum=0;
    void input()
    {
        System.out.print("INPUT CODE : ");
        n=kb .nextInt();
        System.out.println("");
        int z=n;
        int B[]=new int[10];
        int k=0;
        while((z!=0)||(k!=10))
        {
            B[k++]=z%10;
            z=z/10;
        }
        if(k==10)
        {
                   int g=9;
            for(int i=0;i<10;i++)
            {
                A[g--]=B[i];
            }
            
         int f=10;
          for(int j=0;j<10;j++)
          {
          sum = sum +(A[j]*f);
         f--;
         }
    System.out.println("OUTPUT :");
    System.out.println("SUM = "+sum);
    if(sum %11 ==0)
    {
        System.out.println("LEAVES NO REMAINDER -VAILD ISBN NUMBER");
    }
    else
    {
        System.out.println("LEAVES REMAINDER - INVALID ISBN CODE");
    }
}
else
{
    System.out.println("INVALID INPUT");
}
}
public static void main()
{
    ISBN pramod = new ISBN();
    pramod.input();
}
}

        
    
        
        