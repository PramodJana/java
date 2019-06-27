class fruit
{
	int size;
	String name, taste;
	fruit(int size, String name, String taste)
	{
		this.size=size;
		this.name=name;
		this.taste=taste;
	}
	
	void eat()
	{
		System.out.println("Name = "+name);
		System.out.println("Taste = "+taste);
		System.out.println("Size = "+size);
	}
}

class Apple extends fruit
{
	Apple()
	{
		super(10,"Apple","Good");
	}
	
	void eat()
	{
		super.eat();
	}
}

class Orange extends fruit
{
	Orange()
	{
		super(10,"Orange","Better");
	}
	
	void eat()
	{
		super.eat();
	}
}


class fruit_inheritance
{
	public static void main(String[] args)
	{
		System.out.println("Invoking the methods of Apple Class");
		Apple a=new Apple();
		a.eat();
		System.out.println("Invoking the methods of Orange Class");
		Orange o=new Orange();
		o.eat();
	}
}
