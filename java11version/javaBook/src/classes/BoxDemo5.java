package classes;

public class BoxDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box mybox1=new Box();
		Box mybox2=new Box();
		double vol;
		
//		mybox1.setDim(10, 20, 15);
//		mybox2.setDim(3, 6, 9);
		
		vol=mybox1.volume();
		System.out.println("Volume is "+vol);
		
		vol=mybox2.volume();
		System.out.println("Volume is "+vol);
	}

}
