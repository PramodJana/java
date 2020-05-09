package autoboxing_Enum;

import java.lang.reflect.Method;

public class Marker {
	@MyMarker
	public static void myMeth() {
		Marker ob= new Marker();
		
		try {
			Method m= ob.getClass().getMethod("myMeth");
			
			if(m.isAnnotationPresent(MyMarker.class))
				System.out.println("MyMarker is present");
		}catch(NoSuchMethodException exc)
		{
			System.out.println("Method not found.");
		}
	}
	
	public static void main(String [] args) {
		myMeth();
	}
}
