package methods;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack mystack1=new Stack(5);
		Stack mystack2=new Stack(8);
		
		for(int i=0;i<5;i++) mystack1.push(i);
		for(int i=0;i<8;i++) mystack2.push(i);
		
		System.out.println("Stack in mystack1:");
		for(int i=0;i<5;i++)
			System.out.println(mystack1.pop());
		
		System.out.println("Stack in mystack2:");
		for(int i=0;i<8;i++)
			System.out.println(mystack2.pop());
	}

}
