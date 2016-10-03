package de.predikant.java.annotation.repeating;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DrinkableBeer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DrinkableBeer.class);
	
	private DrinkableBeer(){
		// Only static methods.
	}
	
	public static void readDrinkableBeer(){
		for (Method method: Homer.class.getMethods()){
			for (Beer beer: method.getAnnotationsByType(Beer.class)){
				LOGGER.info("Homer can drink: {}", beer.value());
			}
		}
		
	}

}
