import java.util.*;
class BUBBLE
{
    int a[]= new int[5];
    int i, j, temp;
    Scanner kb =new Scanner (System.in);
    void input()
    {
        System.out.println("ENTER THE 5 NUMBER");
        for (i=0;i<5;i++)
        {
            a[i]=kb.nextInt();
        }
        for (int i=0;i<5;i++)
        {
            for (int j=i+1;j<5;j++)
            if(a[j]>a[i])
            {
                temp=i;
                i=j;
                j=temp;
            }
        }
        for (int p=0;p<5;p++)
        {
             System.out.println(+a[p]);
            }
        }
        public static void main(String [] args)
        {
            BUBBLE P= new BUBBLE();
            P.input();
        }
    }
    