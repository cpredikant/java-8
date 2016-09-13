package de.predikant.java.methodreferences;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlaneMethodReferencesExample implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public void doExample(){
		
		// Constructor call with reference
		final Plane p = Plane.create(Plane::new);
		
		final List<Plane> planes = Arrays.asList(p); 
		
		// Static with argumment
		planes.forEach(Plane::collide);
		
		// Static with no argument
		planes.forEach(Plane::repair);
		
		final Plane jetPlane = Plane.create(Plane::new);
		
		// Method reference for Instance with argument.
		planes.forEach(jetPlane::follow);
		
	}

}
