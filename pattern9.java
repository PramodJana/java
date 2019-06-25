import java.io.*;
import java.util.*;
class pattern9
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.print("N=");
		int n=kb.nextInt();
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(k=i;k<=n;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}


		for(i=1;i<n;i++)
		{
			for(j=n-i-1;j>0;j--)
			{
				System.out.print(" ");
			}
			for(k=n-i;k<=n;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
