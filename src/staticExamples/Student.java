package staticExamples;

public class Student {

	
	String name;
	static int count = 0;
	
	public Student() {
		name = "";
		count++;
	}
	
	public Student(String name) {
		this();
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println(name);
	}

	
}
