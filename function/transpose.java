import java.util.*;
class transpose
{   Scanner kb = new Scanner(System.in);
    int m,n;
    int A[][] =new int[1000][10000];
    transpose(int r,int c)
    {
        m=r;
        n=c;
    }
    void inputarray()
    {
        System.out.println("ENTER THE MATRIX");
        for(int i=0;i<m;i++)
        {
        for(int j=0;j<n;j++)
        {
            A[i][j]=kb.nextInt(); 
        }
    }
}
void check(transpose B)
{
    if((B.m==n)&&(B.n==m))
    {
         for(int i=0;i<m;i++)
        {
        for(int j=0;j<n;j++)
        {
            A[i][j]=B.A[j][i];
        }
    }
}
}
void display()
{
     for(int i=0;i<m;i++)
        {
        for(int j=0;j<n;j++)
        {
         System.out.print( A[i][j] + " ");
        }
        System.out.println(" ");
    }
}
public static void main()
{   Scanner v=new Scanner(System.in);
    System.out.println("ENTER THE MATRIX SIZE");
    int a=v.nextInt();
    int b=v.nextInt();
    
    transpose c=new transpose(a,b);
    System.out.println("ENTER THE MATRIX SIZE");
    int e=v.nextInt();
    int f=v.nextInt();
    transpose d=new transpose(e ,f);
    c.inputarray();
    d.inputarray();
    transpose B=new transpose( 0,0);
    B.check(d);
    B.display();
}
}

            