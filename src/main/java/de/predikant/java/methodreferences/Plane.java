package de.predikant.java.methodreferences;

import java.io.Serializable;
import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Plane implements Serializable {
	
	private static final long serialVersionUID = 1L;
		
	private static final Logger LOGGER = LoggerFactory.getLogger(Plane.class);

    public static Plane create( final Supplier< Plane > supplier ) {
        return supplier.get();
    }              
        
    public static void collide( final Plane plane ) {
        LOGGER.info( "Collided {}", plane.toString() );
    }
        
    public void follow( final Plane another ) {
    	LOGGER.info( "Following the {}", another.toString() );
    }
        
    public void repair() {   
    	LOGGER.info( "Repaired {}", this.toString() );
    }
	
}
