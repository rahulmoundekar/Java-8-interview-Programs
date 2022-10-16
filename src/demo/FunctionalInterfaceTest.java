package demo;

@FunctionalInterface
public interface FunctionalInterfaceTest {

	public void addition();
	
	
	//A functional interface can extends another interface only when it does not have any abstract method.
	
	/*
	 * interface sayable{ void say(String msg); // abstract method }
	 * 
	 * @FunctionalInterface interface Doable extends sayable{ // Invalid
	 * '@FunctionalInterface' annotation; Doable is not a functional interface void
	 * doIt(); }
	 */

}
