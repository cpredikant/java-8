package de.predikant.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.predikant.java.annotation.everywhere.PrayFlanders;
import de.predikant.java.annotation.repeating.DrinkableBeer;
import de.predikant.java.interfaces.InterfaceWithDefaults;
import de.predikant.java.interfaces.InterfaceWithDefaultsFactory;
import de.predikant.java.interfaces.InterfaceWithDefaultsImpl;
import de.predikant.java.interfaces.InterfaceWithDefaultsOverrideImpl;
import de.predikant.java.lambda.LambdaExample;
import de.predikant.java.methodreferences.PlaneMethodReferencesExample;
import de.predikant.java.optional.OptionalExamples;

public class Main {
	
	private static Logger LOGGER = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		LOGGER.debug("Start Main");
		
		LambdaExample le = new LambdaExample();
		le.lambdas();
		
		
		InterfaceWithDefaults iwd = InterfaceWithDefaultsFactory.create(InterfaceWithDefaultsImpl::new);
		LOGGER.debug("Interface Impl with call of default impl: {}", iwd.sayHelloTo("Christian"));
		
		InterfaceWithDefaults iwdo = InterfaceWithDefaultsFactory.create(InterfaceWithDefaultsOverrideImpl::new);
		LOGGER.debug("Interface Impl with call of overridden default impl: {}", iwdo.sayHelloTo("Christian"));
		
		
		LOGGER.debug("Method references example");
		PlaneMethodReferencesExample pmre = new PlaneMethodReferencesExample();
		pmre.doExample();
		
		DrinkableBeer.readDrinkableBeer();
		
		LOGGER.debug("Annotations Everywhere, but you don't see them.");
		PrayFlanders.doIt();
		
		OptionalExamples.trySomeOptionals();
		
		LOGGER.debug("End Main");
	}

}
