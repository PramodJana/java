import java.util.*;
import java.io.*;
class distanct_element
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=kb.nextInt();
		int size=(n*2)+2;
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=kb.nextInt();
		}
		TreeSet<String> result=new TreeSet<String>();	
		Arrays.sort(arr);				
		for(int a=0;a<size;a++)
		{
			int key=arr[a];
			int left=0,right=0;
			if(a==0)
			{
				if(arr[a+1]==key)
				{
					right=1;
				}
			}
			else if(a==size-1)
			{
				if(arr[a-1]==key)
				{
					left=1;
				}
			}
			else
			{
				if(arr[a+1]==key)
				{
					right=1;
				}
				if(arr[a-1]==key)
				{
					left=1;
				}
			}
			if((left==1)||(right==1))
			{
			}
			else
			{
				result.add(Integer.toString(key));
			}
		}
		
		Iterator<String> itr= result.iterator();
		while(itr.hasNext())
		System.out.print(itr.next()+" ");

		System.out.println();
	}
}
