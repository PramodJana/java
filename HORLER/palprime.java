import java.util.*;
class palprime
{
    Scanner kb = new Scanner(System.in);
    int n;
   int ispalindrome(int e)
   {   int h=e;
       int g=0;
        while(h!=0){
           int f= h%10;
            g= g*10 + f;
            h= h/10;
        }
        if(g==e)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    int isprime(int j)
    {   int count=0;
        for(int k=1;k<=j;k++)
        {if(k%j==0)
            {
                count++;
            }
        }
        if (count ==2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
      void input()
      {
          System.out.println("ENTER THE WIDTH OF PALPRIME NUMBER");
          n=kb.nextInt();
          if((n>1)&&(n<6))
          {
              if(n==2)
              {
                   System.out.println("11");
                }
                else if(n==3)
                {
                    int z=101;
                    for(int i=2;i<=9;i++)
                    {
                        int a=isprime(i);
                        int b=ispalindrome(i);
                        if((a==1)&&(b==1))
                        {
                            int f=z+i*10;
                            int c=isprime(f);
                            int d=ispalindrome(f);
                            if((c==1)&&(d==1))
                            {
                                 System.out.println(+f);
                                }
                            }
                        }
                    }
                        else if(n==5)
                        {
                            int z= 10001;
                            for(int i=100;i<=999;i++)
                    {
                        int a=isprime(i);
                        int b=ispalindrome(i);
                        if((a==1)&&(b==1))
                        {
                            int f=z+i*10;
                            int c=isprime(f);
                            int d=ispalindrome(f);
                            if((c==1)&&(d==1))
                            {
                                 System.out.println(+f);
                                }
                            }
                        }
                    }
                    else
                    {
                           System.out.println("NO PALPRIME OF THIS WIDTH");
                        }
                    }
                    else
                    {
                           System.out.println("INVALID INPUT");
                        }
                    }
                    public static void main(String[] args)
                    {
                        palprime pramod = new palprime();
                        pramod.input();
                    }
                }
                
                    