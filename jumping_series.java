import java.io.*;
import java.util.*;
class jumping_series
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=kb.nextInt();
		for(int i=0;i<=n;i++)
		{
			int size=noOfDigit(i);
			int arr[]=new int[size];
			setDigit(arr,size,i);
			int res=frequency(arr,size);
			if(res==1)
			{
				System.out.println(i+" ");
			}
		}
		System.out.println();
	}

	public static int noOfDigit(int num)
	{
		int digit=0;
		while(num!=0)
		{
			digit++;
			num/=10;
		}
		return digit;
	}
	
	public static void setDigit(int arr[], int size,int num)
	{
		while(num!=0)
		{
			arr[--size]=num%10;
			num/=10;
		}
	}

	public static int frequency(int arr[],int size)
	{
		int res=1;
		for(int i=0;i<size-1;i++)
		{
			int diff=Math.abs(arr[i]-arr[i+1]);
			if(diff!=1)
			{
				res=0;
				break;
			}
		}
		return res;
	}
}

