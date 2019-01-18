import java .util.*;
class SUM_OFF_CORNERS
{
int a [][]= new int[3][3];
int i=0;
Scanner kb = new Scanner (System.in);
void input()
{
    System.out.println("ENTER THE MATRIX");
    for(int r=0;r<3;r++)
    {
        for(int c=0;c<3;c++)
        {
            a[r][c]= kb .nextInt();
        }
    }
    for(int r=0;r<3;r++)
    {
        for(int c=0;c<3;c++)
        {
            if(((r+c)%2==0)&&(r!=1)&&(c!=1))
            {
                i=i+a[r][c];
            }
        }
    }
        System.out.println("THE SUM OFF CORNERS IS "+i);
    
}
public static void main(String [] args)
{
    SUM_OFF_CORNERS p= new SUM_OFF_CORNERS();
    p.input();
}
}

