package abstractionBasics;

public interface BankAccount {

	public final static int someNum = 15;

	public boolean deposit(double amount);

	public boolean withdraw(double amount);

	public static double max(double a, double b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public default void someMethod() {
		System.out.println("you can have any implementation you want here");
	}

	// the default keyword is used when you have interfaces that you have been using
	// in a lot of classes
	// and now you need to add a new method to the interface
	// you can provide it with a default implementation using the default modifier
	
	

	// you can not create an object of the interfaces
	// you can achieve 100% abstraction with interfaces
	// you can not have implementation for your methods in an interface unless its
	// static or default
	// you can implement multiple interface in one class
	// you are basically overriding the methods when you are providing
	// implementation

	// Things to know
	// 1. what is abstraction
	// 2. differences between interfaces and abstract classes
	// 3. examples of use cases in your project
	// 4. syntaxes

}
