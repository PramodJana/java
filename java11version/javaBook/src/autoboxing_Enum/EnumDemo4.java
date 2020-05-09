package autoboxing_Enum;

public class EnumDemo4 {
	public static void main(String args[]) {
		Apple ap,ap1,ap2;
		
		System.out.println("Here are all apple constants and their ordial values: ");
		
		for(Apple a : Apple.values())
			System.out.println(a+" "+a.ordinal());
		
		ap=Apple.RedDel;
		ap1=Apple.GoldenDel;
		ap2=Apple.RedDel;
		
		System.out.println();
		
		if(ap.compareTo(ap1)<0)
			System.out.println(ap+" comes before "+ap1);
		
		if(ap.compareTo(ap1)>0)
			System.out.println(ap1+" comes before "+ap);
		
		if(ap.compareTo(ap2)==0)
			System.out.println(ap+" equals "+ap2);
		
		System.out.println();
		
		if(ap.equals(ap1))
			System.out.println("Error!");
		
		if(ap.equals(ap2))
			System.out.println(ap+" equals "+ap2);
		
		if(ap==ap2)
			System.out.println(ap+" == "+ap2);
		
	}
}
