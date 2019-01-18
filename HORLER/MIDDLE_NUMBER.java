import java.util.*;
class MIDDLE_NUMBER
{
    int a[][]=new int[3][3];
    int r=0,c=0;
    Scanner kb = new Scanner(System.in);
    void input()
    {
        System.out.println("ENTER THE MATRIX");
        for(int r=0;r<3;r++)
        {
            for ( int c=0;c<3;c++)
            {
                a[r][c]=kb.nextInt();
            }
        }
        for (int r=0;r<3;r++)
        {
            for (int c=0;c<3;c++)
            {
                if (((r+c)==2)&&(r!=0)&&(c!=0))
                {
                    System.out.println("THE MIDDLE NUMBER IS "+a[r][c]);
                }
            }
        }
    }
    public static void main()
    {
        MIDDLE_NUMBER m= new MIDDLE_NUMBER();
        m.input();
    }
}

