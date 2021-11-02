package encapsulationExample;

public class Runner {
	public static void main(String[] args) {
		Student obj = new Student();
		
		System.out.println(obj.getFirstName());
		
		obj.setFirstName("Jack");
		obj.setLastName("Something");
		
		System.out.println(obj.getFirstName());
		System.out.println(obj.getLastName());
	
		
	
	}
}
