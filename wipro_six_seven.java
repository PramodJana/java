import java.util.*;
import java.io.*;
class wipro_six_seven
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the array limit");
		int size=kb.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=kb.nextInt();
		}
		int sum=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==6)
			{
				int pass=check(arr,i);
				i=i+pass;
				if(pass==0)
				sum+=arr[i];
			}
			else
			{
				sum+=arr[i];
			}
		}
		System.out.println(sum);
	}

	public static int check(int [] arr,int index)
	{
		int count=0;
		boolean flag=false;
		
		for(int i=index+1;i<arr.length;i++)
		{
			count++;
			if(arr[i]==7)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			return count;
		}
		else
		{
			return 0;
		}
	}
}
