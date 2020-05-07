package multiThreading;

public class Q {
	int n;
	boolean valueSet= false;
	
	synchronized int get() {
		while(!valueSet)
			try {
				wait();
			}
		catch(InterruptedException e) {
			System.out.println("InterruptionException caught");
		}
		System.out.println("Got: "+n);
		valueSet=false;
		notify();
		return n;
	}
	
	synchronized void put(int n) {
		while(!valueSet)
			try {
				wait();
			}
		catch(InterruptedException e) {
			System.out.println("InterruptionException caught");
		}
		this.n=n;
		valueSet=true;
		System.out.println("Put: "+n);
		notify();
	}
}
