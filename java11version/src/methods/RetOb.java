package methods;

public class RetOb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test ob1= new Test(2);
		Test ob2;
		
		ob2=ob1.incrByTen();
		System.out.println("Ob1.a "+ob1.a);
		System.out.println("Ob2.a "+ob2.a);
		
		ob2=ob2.incrByTen();
		System.out.println("Ob2.a after second increase "+ob2.a);
	}

}
