package autoboxing_Enum;
import java.lang.reflect.*;
public class Single {
	@MySingle(100)
	public static void myMeth() {
		
		Single ob= new Single();
		
		try {
			Method m= ob.getClass().getMethod("myMeth");
			
			MySingle anno=m.getAnnotation(MySingle.class);
			
			System.out.println(anno.value());
		}
		catch(Exception e) {
			System.out.println("No such Method found.");
		}
	}
	
	public static void main(String[] args) {
		myMeth();
	}
}
