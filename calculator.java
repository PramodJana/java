import java.io.*;
import java.util.*;
class calculator
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		int powint=powerInt(2,3);
		System.out.println("After calling the funtion powerInt()");
		System.out.println(powint);
		double powdouble=powerDouble(2,3);
		System.out.println("After calling the funtion powerDouble()");
		System.out.println(powdouble);
	}
	
	public static int powerInt(int num1 , int num2)
	{
		return (int)(Math.pow(num1,num2));
	}
	
	public static double powerDouble(double num1,double num2)
	{
		return (Math.pow(num1,num2));
	}
}
		
