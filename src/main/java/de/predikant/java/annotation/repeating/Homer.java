package de.predikant.java.annotation.repeating;

public interface Homer {
	
	@Beer("Duff")
	@Beer("Pawtucket-Patriot-Ale")
	void drinkBeer();

}
