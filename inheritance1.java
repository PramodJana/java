class Animal
{
	void eat()
	{
		System.out.println("Eat method of class Animal");	
	}

	void sleep()
	{
		System.out.println("Sleep method of class Animal");
	}
}

class Bird extends Animal
{
	void eat()
	{
		System.out.println("Eat method of class Bird");
	}
	
	void sleep()
	{
		System.out.println("sleep method of class bird");
	}

	void fly()
	{
		System.out.println("fly method of class Bird");
	}
}

public class inheritance1
{
	public static void main(String [] args)
	{
		System.out.println("Invoking the methods of animal class");
		Animal a= new Animal();
		a.eat();
		a.sleep();
		System.out.println("Invoking the methods of bird class");
		Bird b= new Bird();
		b.eat();
		b.sleep();
		b.fly();
	}
}
