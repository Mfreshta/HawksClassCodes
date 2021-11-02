package selection;

import java.util.Scanner;

public class CheckingCode {

	static void calculator() {
		Scanner sc = new Scanner(System.in);
		double total = 0;
		double interestRate = 0.0;
		double interestAmount = 0;
		System.out.print("Enter your total: ");
		total = sc.nextDouble();

		if (total >= 900 && total < 2500) {
			interestRate = 2.5;
			interestAmount = (total * interestRate) / 100;
			System.out.println("You should  pay %" + interestRate + " interest which is = $" + interestAmount);
		} else if (total > 500 && total < 900) {
			System.out.println("You should  pay 1.5 interest. ");
			System.out.print("Enter your Interest amount: ");
			interestRate = sc.nextDouble();
			System.out.println("Total amount after adding interest rate = " + " $" + total * interestRate + ". ");
		} else if (total > 100 && total < 500) {
			System.out.println("You should  pay 1.0 interest. ");
			System.out.print("Enter your Interest amount: ");
			interestRate = sc.nextDouble();
			System.out.println("Total amount after adding interest rate. " + " $" + total * interestRate + ". ");
		} else if (total > 2500 && total < 10000) {
			System.out.println("You should  pay 3.5 interest. ");
			System.out.print("Enter your Interest amount: ");
			interestRate = sc.nextDouble();
			System.out.println("Total amount after adding interest rate = " + " $" + total * interestRate + ". ");
		}
	}

	public static void main(String[] args) {
		calculator();
	}
}
