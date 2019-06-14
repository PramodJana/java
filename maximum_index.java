import java.io.*;
import java.util.*;
class maximum_index
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=kb.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=kb.nextInt();
		}
		int max_index=0;
		for(int a=0;a<n;a++)
		{
			for(int b=a+1;b<n;b++)
			{
				if(arr[a]<=arr[b])
				{
					int j=b-a;
					if(j>max_index)
					{
						max_index=j;
					}
				}
			}
		}
		System.out.println("The maximum index is "+max_index);
	}
}
