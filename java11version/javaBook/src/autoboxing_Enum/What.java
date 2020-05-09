package autoboxing_Enum;

//import java.lang.reflect.*;
import java.lang.annotation.*;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface What {
	String description();
}
