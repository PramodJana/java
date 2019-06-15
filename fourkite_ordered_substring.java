import java.io.*;
import java.util.*;
class fourkite_ordered_substring
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		String str=kb.nextLine();
		int len=str.length();
		TreeSet<String> set= new TreeSet<String>();
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<=len;j++)
			{
				set.add(str.substring(i,j));
			}
		}
		
		int count=0;
		Iterator<String> itr= set.iterator();
		while(itr.hasNext())
		{
			if(itr.next()==str)
			{
				count++;
				break;
			}
			else
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
