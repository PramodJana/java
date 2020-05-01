package methods;

public class AccessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 ob= new Test1();
		ob.a=10;
		ob.b=20;
		
//		ob.c=100;
		
		ob.setC(100);
		System.out.println("a,b and c: "+ob.a+" "+ob.b+" "+ob.getC());
	}

}
