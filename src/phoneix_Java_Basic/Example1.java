package phoneix_Java_Basic;

public class Example1 {

	public static void main(String[] args) {
		String type = "";
		double amount = 100;

		// use switch or if statements or conditional operators

		// we have 3 types of accounts, checking, saving, credit
		// if checking and amount is not more than 500, print "Transaction OK"
		// if saving with any amount, print "You can not directly withdraw from saving"
		// if credit, and amount is less than 1000, print "Transaction OK"
		// also, if amount > 500 print "Confirmation message sent!"

		switch (type) {
		case "checking":
			System.out.println(amount < 500 ? "Transaction OK!" : "");

			break;
		case "saving":
			System.out.println("You can not directly withdraw from saving");
			break;
		case "credit":
			if(amount < 1000) {
				System.out.println("Transaction OK!");
			}
			if(amount > 500) {
				System.out.println("Confirmation message sent!");
			}
			break;
		}

	}
}
