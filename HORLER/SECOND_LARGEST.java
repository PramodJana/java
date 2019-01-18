import java.util.*;
class SECOND_LARGEST
{
    int a[] = new int[5];
    int large = 0,second_large=0;
    Scanner kb = new Scanner(System.in);
    void input () 
    {
        System.out.println("ENTER THE ARRAY ELEMENTS");
        for (int i=0;i<5;i++)
        {
            a[i]= kb.nextInt();
        }
        large= a[0];
        for(int j=0;j<5;j++)
        {
            if(a[j]>large)
            {
                large =a[j];
            }
        }
System.out.println("THE LARGEST NUMBER IS "+large);
second_large=a[0];
for (int K=0;K<5;K++)
{
    if((a[K]>second_large)&&(a[K]!=large))
    {
        second_large=a[K];
    }
}
System.out.println("THE SECOND LARGEST NUMBER IS "+second_large);
}
public static void main(String [] args)
{
    SECOND_LARGEST b= new SECOND_LARGEST();
    b.input();
}
}

    
