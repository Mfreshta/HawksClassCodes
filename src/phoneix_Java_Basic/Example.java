package phoneix_Java_Basic;

public class Example {
	public static void main(String[] args) {
		// selection and alternate selection forms

		String x = "test";
		String y = new String("test");
		String z = "test";
		System.out.println(x == y);
		System.out.println(x == z);

		int num = 4;

		if (num % 2 == 0) { // if it returns true, we can also say that num is divisible by 0
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}

		// I will give a number that equals to some int value.
		// print "TEK" if the number is divisible by 3
		// print "School" if the number is divisible by 5
		// print "TEK School" if the number is divisible by 3 and 5
		// print the number if its not divisible by either 3 or 5

		int number = 16;
		System.out.println("-----------------------");
		if (number % 3 == 0 && number % 5 == 0) { // number % 15 == 0
			System.out.println("TEK School");
		} else if (number % 3 == 0) {
			System.out.println("TEK");
		} else if (number % 5 == 0) {
			System.out.println("School");
		} else {
			System.out.println(number);
		}
		System.out.println("-----------------------");
		
		
		
		
		
		
		// use equality operators to compare primitive data types
		//

		// looping
	}
}
