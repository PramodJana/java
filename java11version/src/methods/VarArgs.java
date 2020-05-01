package methods;

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vaTest(10);
		vaTest(1,2,3);
		vaTest();
	}
	static void vaTest(int ...v) {
		System.out.print("Number of args: "+v.length +" Contents: ");
		
		for(int x:v)
			System.out.print(x+" ");
		System.out.println();
	}

}
