import java.util.*;
class zero
{
    
    public static void main(String[] args)
    {   int a[][] = new int[1000][1000];
         int m,n;
        Scanner kb = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS AND COLUMNS");
        m=kb.nextInt();
        n=kb.nextInt();
        System.out.println("ENTER ARRAY ELEMENTS");
        for(int i=0; i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = kb.nextInt();
            }
        }
        for(int r=0;r<m;r++)
        {
            for(int c=0;c<n;c++)
            {
                if (r==c)
                {
                    a[r][c] =0;
                }
            }
        }
        for(int r=0;r<m;r++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[r][j]);
            }
            System.out.println("");
        }
    }
}
