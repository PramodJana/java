package multiThreading;

public class Producer implements Runnable{
	Q q;
	Thread t;
	
	Producer(Q q){
		this.q=q;
		t=new Thread(this,"Producer");
	}
	
	public void run() {
		int i=0;
		
		while(true) {
			q.put(i++);
		}
	}
}
