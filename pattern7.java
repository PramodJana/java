import java.util.*;
class pattern7
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.print("N=");
		int n=kb.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=i-1;k>0;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
