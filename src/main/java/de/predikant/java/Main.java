package de.predikant.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.predikant.java.lambda.LambdaExample;

public class Main {
	
	private static Logger LOGGER = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		LOGGER.debug("Start Main");
		
		LambdaExample le = new LambdaExample();
		le.lambdas();
		
		LOGGER.debug("End Main");
	}

}
