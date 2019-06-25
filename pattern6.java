import java.util.*;
import java.io.*;
class pattern6
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.print("N=");
		int n=kb.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
