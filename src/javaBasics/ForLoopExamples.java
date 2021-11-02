package javaBasics;

public class ForLoopExamples {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		// 10 - 0
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}

		System.out.println("----");
		for (int i = 0; i <= 100; i++) { // i = 2 * 3;
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}
		}

		// i want you to loop from 1 - 100
		// if the number is divisible by 3, print TEK
		// if the number is divisible by 5, print School
		// if the number is divisible by 3 and 5, print TEKSchool
		// if not divisible by 3 or 5, then print the number
		// fizz buzz

		// the main idea you should focus on in this question is - Flow of Execution

		for (int i = 1; i <= 100; i++) { // loop runs for 100 times 
			if (i % 3 == 0 && i % 5 == 0) {// we need to check this condition first
				System.out.println("TEKSchool");
			} else if (i % 5 == 0) {
				System.out.println("School");
			} else if (i % 3 == 0) {
				System.out.println("TEK");
			} else {
				System.out.println(i);
			}
		}



	}

}
