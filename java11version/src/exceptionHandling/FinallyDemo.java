package exceptionHandling;

public class FinallyDemo {
	
	static void procA() {
		try {
			System.out.println("inside procA");
			throw new RuntimeException("demo");
		}
		finally {
			System.out.println("procA's finally");
		}
	}
	
	static void procB() {
		try {
			System.out.println("inside procB");
			}
		finally {
			System.out.println("procB's finally");
		}
	}

	static void procC() {
		try {
			System.out.println("inside procC");
			}
		finally {
			System.out.println("procC's finally");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			procA();
		}catch(Exception e) {
			System.out.println("Exception caught");
		}
		
		procB();
		procC();
	}

}
