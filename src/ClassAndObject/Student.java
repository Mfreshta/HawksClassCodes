package ClassAndObject;

public class Student {

	String name;
	int age;
	int id;
	char gender;

	// default constructor - the constructor that does not have any
	// arguments/parameters is called default constructor
	// the job of the constructor is to initialize all of the variables of the class
	// signature - name and args of a method
	// Definition - anything before the body
	// implementation - the code inside the body of the method
	public Student() {
		name = "";
		age = 0;
		id = 0;
		gender = ' ';
		System.out.println("an object just got created!");
	}

	// Parameterized Constructors - the constructors that have some arguments
	public Student(String newName, int newAge, int newId, char newGender) {
		name = newName;
		age = newAge;
		id = newId;
		gender = newGender;
		System.out.println("an object just got created!");
	}

	public Student(String newName) {
		name = newName;
		age = 0;
		id = 0;
		gender = ' ';
		System.out.println("an object just got created!");
	}

	public void printInfo() {
		String g = "";
		if (gender == 'M') {
			g = "Male";
		} else if (gender == 'F') {
			g = "Female";
		} else {
			g = "NA";
		}
		System.out.println("Name: " + name + ", Age: " + age + ", ID: " + id + ", Gender: " + g);
	}

	public boolean equals(Student theOtherStudent) {

		if (name.equals(theOtherStudent.name)) {
			if (age == theOtherStudent.age) {
				if (id == theOtherStudent.id) {
					if (gender == theOtherStudent.gender) {
						return true;
					}
				}
			}
		}

		return false;
	}

}
