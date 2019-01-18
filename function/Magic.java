import java.util.*;
class Magic
{
    int n;
  
    Magic()
    {
        n=0;
    }
    void getnum(int nn)
    {
        n=nn;
    }
    int Sum_of_digit(int a)
    {
        int d=0;
        while(a!=0)
        {
            int temp =a%10;
            d=d+temp;
           a= a/10;
        }
    return d;
}
void ismagic()
{
    int sum=n;
    int num=Sum_of_digit(sum);
    while(num>9)
    {
        sum =num;
        num=Sum_of_digit(sum);
    }
    if(num==1)
    {
        System.out.println("IT IS A MAGIC NUMBER");
    }
    else
    {
         System.out.println("IT IAS NOT A MAGIC NUMBER");
        }
    }
    public static void main()
    {  Scanner kb = new Scanner(System.in);
        Magic p = new Magic();
         System.out.println("ENTER THE NUMBER");
         int z =kb.nextInt();
         p.getnum(z);
         p.ismagic();
        }
    }
    