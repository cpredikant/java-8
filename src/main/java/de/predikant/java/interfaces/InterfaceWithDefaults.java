package de.predikant.java.interfaces;

import java.io.Serializable;

public interface InterfaceWithDefaults extends Serializable {
	
	default String sayHelloTo(String name){
		return "Hello, " + name;
	}

}
