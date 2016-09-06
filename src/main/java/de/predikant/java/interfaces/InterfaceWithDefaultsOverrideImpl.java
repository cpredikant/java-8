package de.predikant.java.interfaces;

public class InterfaceWithDefaultsOverrideImpl implements InterfaceWithDefaults {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public String sayHelloTo(String name) {
		return "My Own sayHelloTo...Heeeeello, " + name;
	}

}
