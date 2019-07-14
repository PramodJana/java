import java.util.*;
class intersection
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		LinkedList<String> list1=new LinkedList<String>();
		System.out.println("Enter the size of the first List");
		int len1=kb.nextInt();
		System.out.println("Enter the Elements of first LinkedList");
		for(int i=0;i<len1;i++)
		{
			String str=kb.next();
			list1.add(str);
		}

		LinkedList<String> list2=new LinkedList<String>();
		System.out.println("Enter the size of the second List");
		int len2=kb.nextInt();
		System.out.println("Enter the Elements of second LinkedList");
		for(int i=0;i<len2;i++)
		{
			String str=kb.next();
			list2.add(str);
		}

		int diff=Math.abs(len1-len2);
		int res=-1;
		if(len1>len2)
		{
			Iterator<String> itr1=list1.iterator();
			while(diff!=0)
			{
				diff--;
				itr1.next();
			}
			Iterator<String> itr2=list2.iterator();
			while(itr1.hasNext())
			{	String temp=itr1.next();
				String temp1=itr2.next();
				if((temp).equals(temp1))
				{
					res=Integer.parseInt(temp);
					break;
				}
			}
		}
		else
		{
			Iterator<String> itr1=list2.iterator();
			while(diff!=0)
			{
				diff--;
				itr1.next();
			}
			Iterator<String> itr2=list1.iterator();
			while(itr1.hasNext())
			{	String temp=itr1.next();
				String temp1=itr2.next();
				if((temp).equals(temp1))
				{
					res=Integer.parseInt(temp);
					break;
				}
			}
		}
		if(res==-1)
		{
			System.out.println("It has no point of intersection");
		}
		else
		{
			System.out.println("The point of intersection is "+res);
		}		
	}
}
		
