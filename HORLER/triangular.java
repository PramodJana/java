import java .util.* ;
class triangular
{ int num =0, sum =0;
    Scanner kb = new Scanner (System.in);
     void input()
    {
        System.out.println("ENTER THE NUMBER");
        num = kb .nextInt();
        for (int i=0; i<=num;i++)
        {
            sum = sum +i;
            if (sum == num)
            {
                System.out.println("IT IS A TRIANGULAR NUMBER");
                break;
            }
        }
        if (sum !=num)
        {
            System.out.println("IT IS NOT A TRIANGULAR NUMBER");
        }
    }
    public static void main(String [] args)
    {
        triangular p = new triangular();
        p.input();
    }
    
}

        
