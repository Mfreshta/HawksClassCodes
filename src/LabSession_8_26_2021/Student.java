package LabSession_8_26_2021;

public class Student {

	private String firstName;
	private String lastName;
	private int age;

	public Student() {
		super();
		this.firstName = "";
		this.lastName = "";
		this.age = 0;
	}

	public Student(String firstName, String lastName, int age) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean equals(Student stu) {

		if (stu == null) {
			return false;
		}

		if (this.firstName.equals(stu.getFirstName())) {
			if (this.lastName.equals(stu.getLastName())) {
				if (this.age == stu.age) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "First Name: " + firstName + " Last Name: " + lastName + " Age: " + age;
	}

}
