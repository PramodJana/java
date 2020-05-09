package autoboxing_Enum;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
 

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	String str() default "Testing";
	int val() default 9000;
}
