import java.util.*;
class subarray_sum
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int n=kb.nextInt();
		System.out.println("Enter the sum Limit");
		int k=kb.nextInt();
		System.out.println("Enter the array elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=kb.nextInt();
		}
		int start_index=0, end_index=0;
		for(int a=0;a<n;a++)
		{
			int sum=arr[a];
			for(int b=a+1;b<n;b++)
			{
				sum+=arr[b];
				if(sum==k)
				{
					start_index=a;
					end_index=b;
					break;
				}
			}
			if(sum==k)
			{
				break;
			}
		}
		System.out.println("Starting index is "+start_index+" and Ending index is "+end_index);
	}
}
		
