import java.util.*;
class octadecimal
{
    Scanner kb = new Scanner(System.in);
  int n ,oct;
    void input()
    { System.out.println("<--------------------------------------------------------------------------------------------------------------------------------------------->");
         System.out.println("INPUT ");
         System.out.println("ENTER THE NUMBER n ");
        n=kb.nextInt();
        oct=check(n);
         System.out.println("<----------------------------------------------------------------------------------------------------------------------------------------------->");
          System.out.println("OUTPUT ");
           System.out.println("DECIMAL NUMBER = "+n);
            System.out.println("OCTADECIMAL NUMBER IS = "+oct);
             System.out.println("<----------------------------------------------------------------------------------------------------------------------------------------------->");
            }
           int check(int z)
            {
                if (z==0)
                {
                    return 0;
                }
                else
                {
                    return ((check(z/8)*10+(z%8)));
                }
            }
            public static void main()
            {
                octadecimal p= new octadecimal();
                p.input();
            }
        }