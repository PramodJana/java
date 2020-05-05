package exceptionHandling;

class MyException extends Exception{
	private int detail;
	MyException(int a) {
		// TODO Auto-generated constructor stub
		detail=a;
	}
	public String toString() {
		return "MyExeption[" +detail+"]";
	}
}
