import java.util.*;
class enterchange
{
    Scanner kb = new Scanner (System.in);
    int a[][] =new int[1000][1000];
    int m ,n, t;
    void input()
    {
        System.out.println("ENTER THE NUMBER OF ROWS AND COLUMNS");
        m=kb.nextInt();
        n=kb.nextInt();
        System.out.println("ENTER ARRAY ELEMENTS");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] =kb.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0)
                {
                    int temp =a[i][j];
                    a[i][j] = a[m-1][j];
                    a[m-1][j] = temp;
                }
            }
        }
for (int i=0;i<m;i++)
{
    for(int j=0;j<n;j++)
    {
        System.out.print(a[i][j]);
    }
    System.out.println("");
}
}
public static void main()
{
    enterchange p =new enterchange();
    p.input();
}
}
