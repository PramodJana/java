import java.io.*;
import java.util.*;
class spiral
{
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int m=kb.nextInt();
		System.out.println("Enter the number of columns");
		int n=kb.nextInt();
		System.out.println("Enter the matrix");
		int arr[][]= new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=kb.nextInt();
			}
		}
		
		printSpiral(arr, m,n);
	}

	public static void printSpiral(int arr[][] , int m , int n)
	{
		int i, row=0,col=0,lastrow=m-1, lastcol=n-1;
		while(row<=lastrow&&col<=lastcol)
		{
			for(i=col;i<=lastcol;i++)
			{
				System.out.print(arr[row][i]+" ");
			}
			row++;
			for(i=row;i<=lastrow;i++)
			{
				System.out.print(arr[i][lastcol]+" ");
			}
			lastcol--;
			if(row<=lastcol)
			{
				for(i=lastcol;i>=col;i--)
				{
					System.out.print(arr[lastrow][i]+" ");
				}
				lastrow--;
			}
			if(col<=lastcol)
			{
				for(i=lastrow;i>=row;i--)
				{
					System.out.print(arr[i][col]+" ");
				}
				col++;
			}
		}
		System.out.println();
	}
}
