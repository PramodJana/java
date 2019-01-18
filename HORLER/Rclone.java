import java.util.*;
class Rclone
{
    int A[] = new int[10];
    int n ,flag =0;
    void input()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("ENTER THE 10 ARRAY LENGTH");
        for(int i=0;i<10;i++)
        {
            A[i]=kb.nextInt();
        }
        for(int j=0;j<10;j++)
        {
            n=A[j];
            flag=check(n,j);
            if(flag ==1)
            {
                System.out.print(A[j] + " ");
            }
        }
    }
    int check(int a, int b)
    {
        int n=0;
        for(int i=0;i<b;i++)
        {
            if(A[i]==a)
            {
                n=1;
                break;
            }
        }
        if(n==1)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    public static void main()
    {
        Rclone p= new Rclone();
        p.input();
    }
}

    
