package multiThreading;

public class Deadlock implements Runnable {
	A a = new A();
	B b= new B();
	Thread t;
	
	Deadlock(){
		Thread.currentThread().setName("MainThread");
		t= new Thread(this, "RacingThread");
	}
	
	void deadlockStart() {
		t.start();
		a.foo(b);
		System.out.println("Back in main thread");
	}
	
	public void run() {
		b.bar(a);
		System.out.println("Back in other thread");
	}
	
	public static void main(String [] args) {
		Deadlock d1= new Deadlock();
		
		d1.deadlockStart();
	}

}
