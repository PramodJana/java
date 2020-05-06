package inheritance;

public class ChainExcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			demoproc();
		}catch(NullPointerException e) {
			System.out.println("Caught: "+e);
			System.out.println("Origial cause: "+e.getCause());
		}
	}
	
	static void demoproc() {
		NullPointerException e= new NullPointerException("top layer");
		
		e.initCause(new ArithmeticException("cause"));
		
		throw e;
	}

}
