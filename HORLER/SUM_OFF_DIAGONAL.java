import java .util.*;
class SUM_OFF_DIAGONAL
{
    int a[] [] =new int [3][3];
    int r=0 , c=0, sum=0;
     Scanner kb = new Scanner (System.in);
     void input()
     {
         System.out.println("ENTER THE MATRIX");
         for ( int r=0;r<3;r++)
         {
             for (int c=0;c<3;c++)
             {
                 a[r][c]= kb .nextInt();
                }
            }
            for(int r=0; r<3;r++)
            {
                for(int c=0;c<3;c++)
                {
                    if(r==c)
                    {
                        sum=sum+a[r][c];
                    }
                }
            }
for(int r=0;r<3;r++)
{
    for(int c=0;c<3;c++)
    {
        if((c+r)==2)
        {
            sum=sum+a[r][c];
        }
    }
}
System.out.println(+sum);
}
public static void main (String [] args)
{
    SUM_OFF_DIAGONAL P= new SUM_OFF_DIAGONAL();
    P.input();
}
}

             
