import java.io.*;
import java.util.*;
class parenthesis
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the parenthesis string");
		String str=kb.nextLine();
		Stack<String> stack= new Stack<String>();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
			{
				stack.push("(");
			}
			if(str.charAt(i)==')')
			{
				if(stack.peek()=="(")
				{
					count+=2;
				}
				stack.push(")");
			}
		}
		System.out.println("The longest balanced parenthesis is "+count);
	}
}
