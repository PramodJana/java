package classes;

public class BoxDemo4 {
	public static void main(String[] args) {
		Box mybox1=new Box();
		double val1;
		
		mybox1.width=10;
		mybox1.height=20;
		mybox1.depth=15;
		
		val1=mybox1.volume();
		System.out.println("Volume is box 1 is "+val1);
		Box mybox2=new Box();
		double val2;
		
		mybox2.width=3;
		mybox2.height=6;
		mybox2.depth=9;
		
		val2=mybox2.volume();
		System.out.println("Volume is box 2 is "+val2);
		
	}
}
