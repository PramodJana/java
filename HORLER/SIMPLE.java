import java . util.*;
class SIMPLE
{
    int a[]= new int[5];
    int i;
    Scanner kb = new Scanner(System.in);
    void input()
    {
        System.out.println("ENTER 5 NUMBERS");
        for (int i=0;i<5;i++)
        {
            a[i]= kb.nextInt();
        }
        for (int i=0;i<5;i++)
        {
            System.out.println(+a[i]);
        }
    }
    public static void main(String []args)
    {
        SIMPLE P= new SIMPLE();
        P.input();
    }
}
