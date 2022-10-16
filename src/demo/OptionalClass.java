package demo;

import java.util.Optional;

public class OptionalClass {

	/*
	 * Java 8 has introduced a new class Optional in java.util package. It is used
	 * to represent a value is present or absent. The main advantage of this new
	 * construct is that No more too many null checks and NullPointerException. It
	 * avoids any runtime NullPointerExceptions and supports us in developing clean
	 * and neat Java APIs or Applications. Like Collections and arrays, it is also a
	 * Container to hold at most one value.
	 */

	/*
	 * Advantages of Java 8 Optional:
	 * 
	 * Null checks are not required. No more NullPointerException at run-time. We
	 * can develop clean and neat APIs. No more Boiler plate code
	 */

	public static void main(String[] args) {

		Optional<String> gender = Optional.of("MALE");
		Optional<String> emptyGender = Optional.empty();

		if (gender.isPresent()) {
			System.out.println("Value available.");
		} else {
			System.out.println("Value not available.");
		}

		gender.ifPresent(g -> System.out.println("In gender Option, value available."));

		// condition failed, no output print
		emptyGender.ifPresent(g -> System.out.println("In emptyGender Option, value available."));

	}

}
