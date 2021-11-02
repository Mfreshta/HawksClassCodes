package staticExamples;

import abstractionBasics.BankAccount;

public class Runner {

	public static void main(String[] args) {

		// static is a non-access modifier or specifier
		// you can add it to your variables or methods
		
		// static member belongs to the class and not to the objects
		// static call is done by referring to the class dot the member name
		// example: Student.count
		
		Student obj1 = new Student("Jack");
		Student obj2 = new Student("David");
		Student obj3 = new Student("David");
		Student obj4 = new Student("David");
		
		
		
	
		System.out.println(Student.count);
		
		obj4.count = 10;
		
		System.out.println(Student.count);
		
		System.out.println(CalculationsExample.div(10, 10));
		
		
		System.out.println(Math.round(Math.PI));
		
		System.out.println(Math.pow(3, 3));
		
		
//		3^3 == 3 * 3 * 3 = 27
		System.out.println("---"+power(2,3));
		System.out.println(Math.pow(2, 3));
		
		
		
		
		// int --- Integer
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		double x = Double.parseDouble("10.5");
		
		System.out.println(x);
		
		
		
		Student obj5 = new Student("Ahmad");
		
		
		obj5.printInfo();
		
		
		
		
		System.out.println("test method in interface "+BankAccount.max(10, 5));
		
		
		
		
	}
		
	
	public static double power(double a, double b) {
		double res = 1;
		for (int i = 0; i < b; i++) {
			System.out.println(a);
			res *= a;
		}
		return res;
	}
	
	
}
