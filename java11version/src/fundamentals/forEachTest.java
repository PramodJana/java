package fundamentals;

public class forEachTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3,4,5,6,7,8,9,0};
		
		for(int x:nums) {
			System.out.println(x+" ");
			x=x*10;
			System.out.println("new x"+x+" ");
		}
	}

}
