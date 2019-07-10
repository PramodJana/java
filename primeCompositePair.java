import java.util.*;
import java.io.*;
class primeCompositePair
{
	public static void main(String [] args)
	{
		Scanner kb= new Scanner(System.in);
		int testcase=kb.nextInt();
		int arr[]=new int[testcase];
		int index=0;
		while(index<testcase)
		{
			int l=kb.nextInt();
			int r=kb.nextInt(),count=0;
			for(int i=l;i<=r;i++)
			{
				for(int j=i+1;j<=r;j++)
				{
					int res=check(i,j);
					if(res==1)
					{
						count++;
					}
				}
			}
			arr[index++]=count;
		}
		for(int i=0;i<testcase;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static int check(int a,int b)
	{
		if(a==1||a==0||b==1||b==0)
		{
			return 0;
		}
		else
		{
			if(prime(a))
			{
				if(composite(b))
				{	System.out.println(a+" "+b);
					return 1;
				}
				else
				{
					return 0;
				}
			}
			else
			{
				if(prime(b))
				{	System.out.println(a+" "+b);
					return 1;
				}
				else
				{
					return 0;
				}
			}
		}
	}


	public static boolean prime(int num)
	{
		int fact=0;
	        for(int i=1;i<=num;i++)
	        {
	            if(num%i==0)
	            {
	                fact++;
	            }
	        }
	        if(fact==2)
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	}

	public static boolean composite(int num)
	{
		int fact=0;
	        for(int i=1;i<=num;i++)
	        {
	            if(num%i==0)
	            {
	                fact++;
	            }
	        }
	        if(fact>2)
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	}

}


