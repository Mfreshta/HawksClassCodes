package practiceClasses;

public class PracticeQuestion {
	public static void main(String[] args) {

		char c = 'a';

		while (c <= 'z') {
			System.out.print(c);

			if (c != 'z') {
				System.out.print(", ");
			}

			c++;
		}
		System.out.println();

		int b = 5;
		int y = 10 - 6;
		System.out.println(y);

		double balance = 5500; // beginning balance
		double payment1 = 300; // the amount i pay every cycle

		int numberOfPayments = 0; // this is to keep track of the number of payments

		while (balance > 0) { // I want loop for as long as my balance is more than zero
			numberOfPayments++; // every time that i pay, i increase the number of payments

			if (payment1 > balance) { // if the payment I am going make (300) is more than the balance I have
				payment1 = balance; // lets change the payment i have to pay to the current balance
			}

			System.out.println(numberOfPayments + "= balance " + balance + " - " + payment1 + " = "
					+ (balance - payment1) + " is the balance after payment"); // print the whole thing
			balance = balance - payment1; // update the balance and deduct the payment that was made
		}
		System.out.println(numberOfPayments); // print the number of payments made at the end

		while(true) {
			
		}
		
	}
}
