import java.util.*;
import java.io.*;
class pattern8
{
	public static void main(String[] arg)
	{
		Scanner kb=new Scanner(System.in);
		System.out.print("N=");
		int n=kb.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i+1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}


		for(i=2;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
