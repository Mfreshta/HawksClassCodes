package InheritanceExample;

public class C extends B {

	// we are inheriting 2 variables form class B and 3 from class A
	private String notes;
	private String email;
	
	
	// creating a default constructor for class C. 
	// the structure of any constructor is ----   Access-modifier name-of-the-class(args) {body of the method}
	public C() {
		super(); // the super keyword is used to refer to the parent class
		// one of the use cases of the super keyword is to chain constructors
		// it must be the first statement of your constructor
		// you need to match the signature of the constructor you are trying to chain to
		
		this.notes = "";
		this.email = "";
	}
	
	
	
	
}
