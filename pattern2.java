import java.util.*;
import java.io.*;
class pattern2
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=kb.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
