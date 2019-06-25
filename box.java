import java.io.*;
class box
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter The credentails");
		System.out.print("Length=");
		int len=kb.nextInt();
		System.out.print("Weidth=");
		int wid=kb.nextInt();
		System.out.print("Height=");
		int hei=kb.nextInt();
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
