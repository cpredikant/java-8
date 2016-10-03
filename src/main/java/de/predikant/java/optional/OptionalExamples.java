package de.predikant.java.optional;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OptionalExamples {

	private static final Logger LOGGER = LoggerFactory.getLogger(OptionalExamples.class);

	private OptionalExamples() {
		// only static methods.
	}

	public static void trySomeOptionals() {

		Optional<String> fullName = Optional.ofNullable(null);
		LOGGER.info("Full Name is set? " + fullName.isPresent());
		LOGGER.info("Full Name: " + fullName.orElseGet(() -> "[none]"));
		LOGGER.info(fullName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));

		Optional<String> firstName = Optional.of("Bart");
		LOGGER.info("First Name is set? " + firstName.isPresent());
		LOGGER.info("First Name: " + firstName.orElseGet(() -> "[none]"));
		LOGGER.info(firstName.map(s -> "Hey " + s + "!").orElse("Hey Stranger"));

	}

}
