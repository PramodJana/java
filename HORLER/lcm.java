import java.util.*;
class lcm
{
    int a=0 , b=0;
    Scanner kb = new Scanner(System.in);
    void input ()
    {
        int LCM =1;
        System.out.println("enter the first number");
        a= kb .nextInt();
        System.out.println("enter the second number");
        b= kb .nextInt();
        if (a<0)
        { a=  -a;
    }
    if (b<0)
    {
        b= -b;
    }
    int n=1;
 while ((n<=a)&&(n<=b))
    { n++;
        
        if ((a%n ==0)&&(b%n==0))
        {
            LCM = LCM * n;
        }
       
    } 
        System.out.println("THE LCM OF TWO NUMBERS IS  =  " +LCM);
   
}

public static void main(String [] args)
{
    lcm p = new lcm();
    p.input();
}
}

    
