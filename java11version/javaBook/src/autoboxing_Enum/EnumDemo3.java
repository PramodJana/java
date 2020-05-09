package autoboxing_Enum;

public class EnumDemo3 {
	public static void main(String [] args) {
		
		
		System.out.println("Winesap costs "+Apple.Winesap.getPrice()+" cents.\n");
		
		System.out.println("All apple prices:");
		for(Apple a : Apple.values())
			System.out.println(a+" costs "+a.getPrice()+" cents.");
		
	}
}
