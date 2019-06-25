import java.io.*;
import java.util.*;
class Author
{
	String name,email;
	char gender;
	
	Author(String name, String email, char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
}

class bookAuthor
{
	String name;
	double price;
	int stock;
	
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the author credentails");
		String n=kb.nextLine();
		String e=kb.nextLine();
		char g=kb.next().charAt(0);
		Author auth=new Author(n,e,g);
		bookAuthor ba= new bookAuthor();
		ba.setName("Shiv");
		ba.setPrice(100.0);
		ba.setStock(20);
		System.out.println("*********************************************************************************************");
		System.out.println("Printing the details of the author");
		System.out.println(auth.name);
		System.out.println(auth.email);
		System.out.println(auth.gender);
		System.out.println("*********************************************************************************************");
		System.out.println("Printing the details of the book");
		ba.getName();
		ba.getPrice();
		ba.getStock();
		System.out.println("*********************************************************************************************");
	}

	void setName(String name)
	{
		this.name=name;
	}

	void setPrice(double price)
	{
		this.price=price;
	}

	void setStock(int stock)
	{
		this.stock=stock;
	}
	
	void getName()
	{
		System.out.println(name);
	}

	void getPrice()
	{
		System.out.println(price);
	}

	void getStock()
	{
		System.out.println(stock);
	}
}
