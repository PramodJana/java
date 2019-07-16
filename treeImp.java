import java.io.*;
import java.util.*;
class treeImp
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the number of nodes");
		int n=kb.nextInt();
		int arr[]=new int[n];
		int newN= (int)(Math.pow(2,n))-1;
		System.out.println("Enter the nodes");
		for(int i=0;i<n;i++)
		{
			arr[i]=kb.nextInt();
		}
		int arr1[]=new int[newN];
		for(int i=0;i<newN;i++)
		{
			arr1[i]=-1;
		}
		for(int i=0;i<n;i++)
		{
			fill(0,arr[i],arr1);
		}
		for(int i=0;i<newN;i++)
		{	if(arr1[i]!=-1)
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
	}
	
	public static void fill(int root, int key, int arr[])
	{
		if(arr[root]==-1)
		{
			arr[root]=key;
		}
		else
		{
			if(arr[root]<key)
			{
				fill(root*2+2,key,arr);
			}
			if(arr[root]>key)
			{
				fill(root*2+1,key,arr);
			}
		}
	}
}
