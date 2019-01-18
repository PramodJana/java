import java.util.*;
class Diagonal
{
    public static void main()
    {
        Scanner kb = new Scanner(System.in);
        int a[][] =new int[1000][1000];
        int m,n,sum =0;
        System.out.println("ENTER THE NUMBERS OF ROWS AND COLUMNS");
        m=kb.nextInt();
        n=kb.nextInt();
        System.out.println("ENTER ARRAY ELEMENTS");
        for(int r=0;r<m;r++)
        {
            for(int c=0;c<n;c++)
            {
                a[r][c] = kb.nextInt();
            }
        }
        int h=m;
        for(int r=0;r<m;r++)
        {
            h--;
            for(int c=0;c<n;c++)
            {
                if(r==c)
                {
                    sum =sum+a[r][c];
                }
                if(c==(h))
                {
                    sum=sum+a[r][c];
                }
            }
        }
        int z =(m/2);
        int w=(n/2);
        System.out.println("SUM OF BOTH THE DIAGONAL IS " +(sum -a[z][w]));
    }
}

    