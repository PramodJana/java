package Generics;

public class GenIFDemo {
	public static void main(String [] args) {
		Integer inum[]= {3,6,2,8,6};
		Character chs[]= {'b','r','p','w'};
		
		MyClass<Integer> iob= new MyClass<Integer>(inum);
		MyClass<Character> cob= new MyClass<Character>(chs);
		
		System.out.println("Max value in inums: "+ iob.max());
		System.out.println("Min value in inums: "+iob.min());
		

		System.out.println("Max value in chs: "+ cob.max());
		System.out.println("Min value in chs: "+cob.min());
	}
}
