package recurstion;

import java.util.*;
class PowerRec
{
    public static void main(String [] args)
    {
        PowerRec ob = new PowerRec();
        long a, b,res;
        try
        {
            Scanner kb = new Scanner(System.in);
            System.out.println("ENTER THE VALUE OF A:");
            a= kb.nextLong();
             System.out.println("ENTER THE VALUE OF B:");
             b = kb.nextLong();
             res = ob.pow(a,b);
              System.out.println("THE VALUE OF A TO POWER B IS =" +res);
            }
            catch(Exception e)
            {
                 System.out.println(e);
                }
            }
            private long pow (long m , long n)
            {
                if (n==1)
                {
                    return m;
                    
                }
                else
                {
                    return (m *pow(m,n-1));
                }
            }
        }

        