import java.util.*;
import java.io.*;
class fourkites_walls
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the number of walls");
		int noOfWalls=kb.nextInt();
		System.out.println("Enter the walls");
		int arr[]=new int[noOfWalls];
		for(int i=0;i<noOfWalls;i++)
		{
			arr[i]=kb.nextInt();
		}
		int maxi=0,maxj=0,max=0;
		for(int a=0;a<noOfWalls;a++)
		{
			for(int b=a+1;b<noOfWalls;b++)
			{
				int check=(Math.min(a,b))*(b-a);
				if(check>max)
				{
					maxi=a;
					maxj=b;
					max=check;
				}
			}
		}
		System.out.println("The walls which will remain are "+arr[maxi]+" "+arr[maxj]);
	}
}
