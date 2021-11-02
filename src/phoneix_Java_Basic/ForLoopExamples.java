package phoneix_Java_Basic;

public class ForLoopExamples {
	public static void main(String[] args) {

		// for loop
		// for (1-initialize the counter ; 2-Conditions ; 4-Update){

		// 3- loop body

		// }

		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("-------------------");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("-------------------");
		for (int i = 0; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("-------------------");

		// write a for loop that prints the following
		// 7 - 18
		// 9 - 15
		// 5 - -5
		// -10 - 0
		// a - d

		String status = "Pending";
		double grade = 97;
		
		switch (status) {
		case "Passed":
			System.out.println("You passed");
			if(grade > 95) {
				System.out.println("You passed with a great grade");
			} 
			
			break;

		case "Failed":
			System.out.println("You failed this time, try again");
			break;

		case "Pending":
			for (int i = 1; i <= 10; i++) {
				System.out.println(status + " " + i);
			}
			break;

		default:

		}

	}

}
