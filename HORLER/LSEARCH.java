 

import java.util.*;
class LSEARCH
{
    int a[]=new int[5];
    int i , item=0,flag=0;
    Scanner kb = new Scanner (System.in);
    void input()
    {
        System.out.println("ENTER THE 5 NUMBERS");
        {
            for(i=0;i<5;i++)
            {
                a[i]=kb.nextInt();
            }
            System.out.println("ENTER THE NUMBER TO BE SEARCHED");
            item= kb .nextInt();
            for(i=0;i<5;i++)
            {
                if (item==a[i])
                {
                    flag=1;
                    break;
                }
            }
            if (flag==1)
            {
                System.out.println("THE NUMBER IS PRESENT IN THE POSITON"+(i+1));
            }
            else{
                System.out.println("THE ELEMENT DOES NOT EXISTS");
            }
        }
    }
    public static void main (String [] args)
    {
        LSEARCH P= new LSEARCH();
        P.input();
    }
}
    