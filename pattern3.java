import java.io.*;
import java.util.*;
class pattern3
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.print("N=");
		int n=kb.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
