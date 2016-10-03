package de.predikant.java.annotation.repeating;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(value ={TYPE, METHOD})
@Repeatable(Beers.class)
public @interface Beer {
	String value();
}
