package demo;

import java.util.Date;

public class Immutable_16 {

	/**
	 * Integer class is immutable as it does not provide any setter to change its
	 * content
	 */
	private final Integer immutableField1;

	/**
	 * String class is immutable as it also does not provide setter to change its
	 * content
	 */
	private final String immutableField2;

	/**
	 * Date class is mutable as it provide setters to change various date/time parts
	 */
	private final Date mutableField;

	// Default private constructor will ensure no unplanned construction of class
	private Immutable_16(Integer fld1, String fld2, Date date) {
		this.immutableField1 = fld1;
		this.immutableField2 = fld2;
		this.mutableField = new Date(date.getTime());
	}

	// Factory method to store object creation logic in single place
	public static Immutable_16 createNewInstance(Integer fld1, String fld2, Date date) {
		return new Immutable_16(fld1, fld2, date);
	}

	// Provide no setter methods

	/**
	 * Integer class is immutable so we can return the instance variable as it is
	 */
	public Integer getImmutableField1() {
		return immutableField1;
	}

	/**
	 * String class is also immutable so we can return the instance variable as it
	 * is
	 */
	public String getImmutableField2() {
		return immutableField2;
	}

	/**
	 * Date class is mutable so we need a little care here. We should not return the
	 * reference of original instance variable. Instead a new Date object, with
	 * content copied to it, should be returned.
	 */
	public Date getMutableField() {
		return new Date(mutableField.getTime());
	}

	@Override
	public String toString() {
		return immutableField1 + " - " + immutableField2 + " - " + mutableField;
	}

	public static void main(String[] args) {
		Immutable_16 im = Immutable_16.createNewInstance(100, "test", new Date());
		System.out.println(im);
		tryModification(im.getImmutableField1(), im.getImmutableField2(), im.getMutableField());
		System.out.println(im);
	}

	private static void tryModification(Integer immutableField1, String immutableField2, Date mutableField) {
		immutableField1 = 10000;
		immutableField2 = "test changed";
		mutableField.setDate(10);
	}
}



/*
 * Lets first identify advantages of immutable class. In Java, immutable classes
 * are:
 * 
 * are simple to construct, test, and use are automatically thread-safe and have
 * no synchronization issues do not need a copy constructor do not need an
 * implementation of clone allow hashCode() to use lazy initialization, and to
 * cache its return value do not need to be copied defensively when used as a
 * field make good Map keys and Set elements (these objects must not change
 * state while in the collection) have their class invariant established once
 * upon construction, and it never needs to be checked again always have
 * “failure atomicity” (a term used by Joshua Bloch) : if an immutable object
 * throws an exception, it’s never left in an undesirable or indeterminate state
 */
