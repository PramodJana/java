import java.io.*;
import java.util.*;
class box
{
	static int len,wid,hei;
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter The credentails");
		System.out.print("Length=");
		len=kb.nextInt();
		System.out.print("Weidth=");
		wid=kb.nextInt();
		System.out.print("Height=");
		hei=kb.nextInt();
		box b=new box(len,wid,hei);
		b.calculate();
	}
	
	public void calculate()
	{
		System.out.println(len*wid*hei);
	}

	box(int l,int w, int h)
	{
		len=l;
		wid=w;
		hei=h;
	}
}
