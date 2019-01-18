import java.util.*;
class REVERSE
{
    int a[] = new int[5];
    int b[] = new int[5];
    int k=0,j=0,f=0,p=0;
    Scanner kb = new Scanner(System.in);
    void input ()
    {
        System.out.println("ENTER THE FIVE ELEMENTS");
            for ( int i=0; i<5;i++)
            {
                a[i] = kb .nextInt();
            }
            for(int i=0;i<5;i++)
            {
                f=0;
                k=a[i];
                while(k>0)
                {
                  j=k%10;
                  f=(f*10)+j;
                  k=k/10;
                }
                   for(int j=0;j<5;j++)
                   {
                    b[i]=f;   
                   
                }
            }
                for (int j=0;j<5;j++)
                {
                    System.out.println(b[j]);
            }
        
        }
    
        public static void main(String [] args)
        {
            REVERSE P= new REVERSE ();
            P.input();
        }
    }

