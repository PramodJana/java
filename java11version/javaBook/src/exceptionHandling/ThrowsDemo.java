package exceptionHandling;

public class ThrowsDemo {
	static void throwone() throws IllegalAccessException{
		System.out.println("Inside throwOne.");
		throw new IllegalAccessException("demo");
	}
	public static void main(String [] args) {
		try {
			throwone();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("Caught "+e);
		}
	}
}
