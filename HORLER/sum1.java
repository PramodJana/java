import java.util.*;
class sum1
{
    int a[][] = new int[3][3];
    int b[][] = new int [3][3];
    int d[][] = new int [3][3];
    int r=0, c=0;
    Scanner kb= new Scanner (System.in);
    void input()
    {
         System.out.println("ENTER THE FIRST MATRIX");
         for (r=0; r<3;r++)
         {
             for(c=0;c<3;c++)
             {
                 a[r][c] = kb.nextInt();
                }
            }
          System.out.println("ENTER THE SECOND MATRIX");
         for (r=0; r<3;r++)
         {
             for(c=0;c<3;c++)
             {
                 b[r][c] = kb.nextInt();
                }
            }
         for (r=0; r<3;r++)
         {
             for(c=0;c<3;c++)
             {
                 d[r][c]=a[r][c]+b[r][c];
                }
            }   
         for (r=0; r<3;r++)
         {
             for(c=0;c<3;c++)
             {
                 System.out.println(+d[r][c]);
                }
                System.out.println();
            }
        }
        public static void main(String [] args)
        {
            sum1 p= new sum1();
            p.input();
        }
    }

