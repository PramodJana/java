import java.io.*;
import java.util.*;
class wipro_reverse
{
	public static void main(String [] args)
	{
		int len=args.length;
		if(len!=4)
		{
			System.out.println("Please enter 4 integer numbers");
		}
		else
		{
			int arr[][]=new int[2][2],count=0;
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					arr[i][j]=Integer.parseInt(args[count++]);
				}
			}
			System.out.println("The given array is :");
			for(int ii=0;ii<2;ii++)
			{
				for(int jj=0;jj<2;jj++)
				{
					System.out.print(arr[ii][jj]+" ");
				}
				System.out.println();
			}
			System.out.println(" The reverse of the array is :");
			for(int x=1;x>=0;x--)
			{
				for(int y=1;y>=0;y--)
				{
					System.out.print(arr[x][y]+" ");
				}
				System.out.println();
			}
		}
	}
}
