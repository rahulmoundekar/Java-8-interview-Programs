package demo;

@FunctionalInterface
public interface InterDefaultMethod_23 extends FunctionalInterfaceTest {
	
	public void addition();

	default void add() {
		
		/*
		 * Why do we need Default Methods/ Advantages of defining Default Method? 
		 * 
		 * The
		 * primary idea of including default method in interface is that don’t force the
		 * implementing classes to override it. Till JDK 1.7, all implementing classes
		 * were supposed to override the method declared in the interface and provide
		 * the concrete implementation of the methods. But after the introduction of
		 * default method in Interface, implementing classes are free to either override
		 * it or not as per the required behavior.
		 */
	}
	
	


	
	
}
