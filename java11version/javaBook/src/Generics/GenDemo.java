package Generics;

public class GenDemo {
	public static void main(String[] args) {
		Gen<Integer> iob;
		
		iob= new Gen<Integer>(88);
		
		iob.showType();
		
		int v= iob.getob();
		System.out.println("value: "+v);
		
		System.out.println();
		
		Gen<String> strOb= new Gen<String>("Generic Test");
		
		strOb.showType();
		
		String str=strOb.getob();
		System.out.println("value: "+str);
	}
}
