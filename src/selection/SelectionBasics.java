package selection;

public class SelectionBasics {

	public static void main(String[] args) {

		int age = 20;

		if (age > 20) {
			System.out.println("they can take loan");
		} else {
			System.out.println("they can not take loan");
		}

		// grading example

		// 0 - 100
		// 90 - 100 = A
		// 80 - 90 = B
		// 70 - 80 = C
		// 60 - 70 = D
		// <60 = F

		double grade = 89.5;

		if (grade >= 90) { // checking for A
			System.out.println("A");
		} else if (grade >= 80) { // checking for B
			System.out.println("B");
		} else if (grade >= 70) { // checking for C
			System.out.println("C");
		} else if (grade >= 60) { // checking for D
			System.out.println("D");
		} else { // F
			System.out.println("F");
		}

		if (grade < 60) {
			System.out.println("F");
		} else if (grade < 70) {
			System.out.println("D");
		} else if (grade < 80) {
			System.out.println("C");
		} else if (grade < 90) {
			System.out.println("B");
		} else {
			System.out.println("A");
		}

		//

		double total = 50;
		double interest = 0;

		// check to see if the total is within these ranges and change interest based on
		// that

		// if total is more than 3500, then check to see if the number is odd or even
		// for odd, interest = 5.5
		// for even, interest = 6.5
		// for totals 2500 - 3500, interest should be 3.5
		// for totals 900 - 2500, interest should be 2.5
		// for totals 500 - 900, interest should be 1.5
		// for totals 100 - 500, interest should be 1.0

		if (total > 3500) {
			// for odd, interest = 5.5
			if (total % 2 == 0) {
				// even
				// interest should be 6.5
				interest = total * 6.5 / 100;
				System.out.println("total: " + total + " interest 6.5%  = " + interest + " = " + (total + interest));
				System.out.println("Even");
			} else {
				// odd
				// interest should be 5.5
				interest = total * 0.055;
				System.out.println("total: " + total + " interest 5.5%  = " + interest + " = " + (total + interest));
				System.out.println("Odd");
			}
			// for even, interest = 6.5

		} else if (total >= 2500) {
			// interest should be 3.5
			interest = total * 0.035;
			System.out.println("total: " + total + " interest 3.5%  = " + interest + " = " + (total + interest));

		} else if (total >= 900) {
			// interest should be 2.5
			interest = total * 0.025;
			System.out.println("total: " + total + " interest 2.5%  = " + interest + " = " + (total + interest));

		} else if (total >= 500) {
			// interest should be 1.5
			interest = total * 0.015;
			System.out.println("total: " + total + " interest 1.5%  = " + interest + " = " + (total + interest));

		} else if (total >= 100) {
			// interest should be 1.0
			interest = total * 0.01;
			System.out.println("total: " + total + " interest 1.0%  = " + interest + " = " + (total + interest));

		} else {
			// interest should be 0.0
			interest = 0;
			System.out.println("total: " + total + " interest 0.0%  = " + interest + " = " + (total + interest));

		}

	}

}
