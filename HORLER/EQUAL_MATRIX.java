import java .util.*;
class EQUAL_MATRIX
{
    int a[][] =new int[3][3];
    int b[][] = new int [3][3];
    int r, c, sum=1;
    Scanner kb = new Scanner(System.in);
    void input()
    {
        System.out.println("ENTER THE FIRST MATRIX");
        for(int r=0;r<3;r++)
        {
            for(int c=0;c<3;c++)
            {
                a[r][c] = kb .nextInt();
            }
        }
     System.out.println("ENTER THE SECOND MATRIX");
        for(int r=0;r<3;r++)
        {
            for(int c=0;c<3;c++)
            {
                b[r][c] = kb .nextInt();
            }
        }

    
        for(int r=0;r<3;r++)
        {
            for(int c=0;c<3;c++)
            {
                if (a[r][c]!= b[r][c])
                {
                    sum=sum+1;
                }
            }
        }
        if(sum>1)
        {
             System.out.println("NOT EQUAL");
            }
            else
            {
                 System.out.println("EQUAL");
                }
            }
        
        public static void main(String [] args)
        {
            EQUAL_MATRIX m= new EQUAL_MATRIX();
            m.input();
        }
    }
    
