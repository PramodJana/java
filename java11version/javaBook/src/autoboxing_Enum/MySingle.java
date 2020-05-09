package autoboxing_Enum;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface MySingle {
	int value();
}
