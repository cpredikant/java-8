package de.predikant.java.interfaces;

import java.util.function.Supplier;

public interface InterfaceWithDefaultsFactory {
	
	static InterfaceWithDefaults create(Supplier<InterfaceWithDefaults> supplier){
		return supplier.get();
	}

}
