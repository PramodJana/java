import java.io.*;
import java.util.*;
class pattern4
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.print("N=");
		int n=kb.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
