package demo;

@FunctionalInterface
public interface InterStatic_22 {

	public void addition();

	static void add() {
		
		//Why we need a Static Method in Interface?
		/*
		 * If you want to provide some implementation in your interface and you don’t
		 * want this implementation to be overridden in the implementing class, then you
		 * can declare the method as static. Hence, we can secure an implementation by
		 * having it in static method as implementing classes can’t override it.
		 * Moreover, we define static methods inside classes to use them as general
		 * utility methods. Similarly, we can define static methods in interface to use
		 * them as general utility methods.
		 */
		
		/*
		 * Java interface static method is part of interface, we can’t use it for
		 * implementation class objects. 
		 * 
		 * Java interface static methods are good for
		 * providing utility methods, for example null check, collection sorting etc.
		 * 
		 * 
		 * Java interface static method helps us in providing security by not allowing
		 * implementation classes to override them. 
		 * 
		 * We can’t define interface static
		 * method for Object class methods, we will get compiler error as “This static
		 * method cannot hide the instance method from Object”. This is because it’s not
		 * allowed in java, since Object is the base class for all the classes and we
		 * can’t have one class level static method and another instance method with
		 * same signature. 
		 * 
		 * We can use java interface static methods to remove utility
		 * classes such as Collections and move all of it’s static methods to the
		 * corresponding interface, that would be easy to find and use.
		 */
	}
}
