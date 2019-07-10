import java.util.*;
abstract class Compartment
{
	public abstract String notice();
}

class FirstClass extends Compartment
{
	public String notice()
	{
		return "This messege is from First Class";
	}
}

class Ladies extends Compartment
{
	public String notice()
	{
		return "This messege is from Ladies";
	}
}

class General extends Compartment
{
	public String notice()
	{
		return "This messege is from General Class";
	}
}

class Luggage extends Compartment
{
	public String notice()
	{
		return "This messege is from Luggage";
	}
}

public class TestCompartment
{
	public static void main(String [] args)
	{
	Random rand= new Random();
	int arr[]=new int[10];
	for(int i=0;i<10;i++)
	{
		arr[i]=rand.nextInt(4);
		System.out.print((i+1)+" ");
		switch(arr[i])
		{
			case 0:
			FirstClass f=new FirstClass();
			System.out.println(f.notice());
			break;			
			case 1:
			Ladies l=new Ladies();
			System.out.println(l.notice());
			break;
			case 2:
			General g=new General();
			System.out.println(g.notice());
			break;
			case 3:
			Luggage L=new Luggage();
			System.out.println(L.notice());
		}
	}
	}
}




