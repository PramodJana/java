import java.io.*;
import java.util.*;
class wipro_unique_elements
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int len=kb.nextInt();
		int arr[]=new int[len];
		System.out.println("Enter the array elements");
		for(int i=0;i<len;i++)
		{
			arr[i]=kb.nextInt();
		}
		for(int a=0;a<len;a++)
		{
			for(int b=a+1;b<len;b++)
			{
				if(arr[a]==arr[b]&&arr[a]!=(-99999))
				{
					arr[b]=(-99999);
				}
			}
		}
		System.out.println("After removing the redundant array");
		for(int z=0;z<len;z++)
		{
			if(arr[z]!=(-99999))
			{
				System.out.print(arr[z]+" ");
			}
		}
		System.out.println();
	}
}
