package Generics;

public class SimpGen {
	public static void main(String[] args) {
		TwoGen<Integer, String> tgObj=
				new TwoGen<Integer, String>(88,"Generics");
		
		tgObj.showTypes();
		
		int v= tgObj.getob1();
		System.out.println("value: "+v);
		
		String str= tgObj.getob2();
		System.out.println("value: "+str);
	}
}
