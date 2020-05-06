package inheritance;



public class Dispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a = new AA();
		BB b = new BB();
		CC c = new CC();
		
		AA r;
		
		r=a;
		r.callme();
		
		r=b;
		r.callme();
		
		r=c;
		r.callme();
	}

}
