import java.util.*;
import java.io.*;
class pattern5
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.print("N=");
		int n=kb.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=n-i;j>0;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
