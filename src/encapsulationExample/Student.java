package encapsulationExample;

public class Student {

	
	// Bean class
	// keyword this 
	// encapsulation
	
	// this 
	
	private String firstName;
	private String lastName;
	
	public Student() {
		firstName = "";
		lastName = "";
	}
	
	// getter for the first name - make sure that your return data type matches the variable 
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	// setters - you gonna return nothing - void. but you have to get the new data in as your parameter
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// 'this' keyword - it is used in a method to refer to the variables of your class instead of the variables in the method
	
}
