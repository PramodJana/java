import java.util.*;
class Composite
{
    Scanner kb= new Scanner(System.in);
    int A[][] = new int[20][20];
    int m,n;
    Composite(int mm,int nn)
    {
        m=mm;
        n=nn;
    }
    int isComposite(int p)
    {   int count=0;
        for(int i=1;i<=p;i++)
        {
            if(p%i==0)
            {
                count++;
            }
        }
        if(count ==2)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    void fill()
    {   int k=0,l=0;
        int B[] =new int[100];
        for(int i=2;i<1000;i++)
        {
            int check=isComposite(i);
            if(check==1)
            {
                B[k++]=i;
            }
        }
        for(int a=0;a<m;a++)
        {
            for(int b=0;b<n;b++)
            {
                A[b][a]=B[l++];
            }
        }
    }
    void display()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Composite p= new Composite();
        
       p.Composite(m,n);
       p.fill();
       p.display();
    }
}
