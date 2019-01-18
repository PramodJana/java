import java.util.*;
class numbers
{
    int num , num1, num2, num3,p;
    Scanner kb = new Scanner(System.in);
    void input ()
     {
    System.out.println("ENTER THE NUMBER LESS THAN 1000");
    num = kb.nextInt();
    num1 = num/100;
    num3 = num%10;
    p=num/10;
    num2 = p%10;
    if((num1 >0)&&(num1<9))
    {
        input1(num1);
    System.out.println(" " +"HUNDERED" +" ");
}
if (num2 == 1)
{
    input2(num2);
}
else
{
    input3 (num2);
}
if((num3>0)&&(num3<=9)&&(num2 !=1))
{
    input1(num3);
}
if(num==0)
{
System.out.println("ZERO");
}
}
public void input1(int a)
{
    String ans;
    switch(a)
    {
        case 0:
        break;
        case 1:
        System.out.println("ONE");
        break;
        case 2:
        System.out.println("TWO");
        break;
        case 3:
        System.out.println("THREE");
        break;
        case 4:
        System.out.println("FOUR");
        break;
        case 5:
        System.out.println("FIVE");
        break;
        case 6:
        System.out.println("SIX");
        break;
        case 7:
        System.out.println("SEVEN");
        break;
        case 8:
        System.out.println("EIGHT");
        break;
        case 9:
        System.out.println("NINE");
    }
}

 public void input2(int b)
{
    String ans;
    switch(b)
    {
        case 0:
        System.out.println("TEN");
        break;
        case 1:
        System.out.println("ELEVEN");
        break;
        case 2:
        System.out.println("TWELVE");
        break;
        case 3:
        System.out.println("THIRTEEN");
        break;
        case 4:
        System.out.println("FOURTEEN");
        break;
        case 5:
        System.out.println("FIFTEEN");
        break;
        case 6:
        System.out.println("SIXTEEN");
        break;
        case 7:
        System.out.println("SEVENTEEN");
        break;
        case 8:
        System.out.println("EIGHTEEN");
        break;
        case 9:
        System.out.println("NINETEEN");
    }
}
public void input3(int c)
{
    String ans;
    switch(c)
    {
        case 0:
        break;
        case 1:
        System.out.println(" ");
        break;
        case 2:
        System.out.println("TWENTY");
        break;
        case 3:
        System.out.println("THIRTY");
        break;
        case 4:
        System.out.println("FOURTY");
        break;
        case 5:
        System.out.println("FIFTY");
        break;
        case 6:
        System.out.println("SIXTY");
        break;
        case 7:
        System.out.println("SEVENTY");
        break;
        case 8:
        System.out.println("EIGHTY");
        break;
        case 9:
        System.out.println("NINETY");
    }
}     
public static void main (String [] args)
{
    numbers p = new numbers();
    p.input();
}
}

