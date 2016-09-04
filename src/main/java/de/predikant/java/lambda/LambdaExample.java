package de.predikant.java.lambda;

import java.io.Serializable;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LambdaExample implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LambdaExample.class);
	
	private String global = "global";
	
	public void lambdas(){
		Arrays.asList("a", "b", "c").forEach(e -> LOGGER.debug("Element {}",e ));
		
		Arrays.asList("1","2","3").forEach((String e) -> LOGGER.debug("Element {}",e ));
		
		Arrays.asList("Hans,Dampf", "Max,Muster", "John,Doe").forEach(e->{
			String[] nameParts = e.split(",");
			LOGGER.debug("Vorname {}, Nachname {}", new Object[]{nameParts[0], nameParts[1]});
			
		});
		
		final String local = "local";
		
		Arrays.asList("Hans,Dampf", "Max,Muster", "John,Doe").forEach(e->{
			String[] nameParts = e.split(",");
			LOGGER.debug("Vorname {}, Nachname {}", new Object[]{nameParts[1], nameParts[0]});
			LOGGER.debug("Local {} Global {}", new Object[]{local, global});
			
		});
		
	}

}
