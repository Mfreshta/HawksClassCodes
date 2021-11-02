package javaBasics;

public class WhileLoopExamples {
	public static void main(String[] args) {

		int x = 1;

		while (x <= 10) {
			System.out.println(x++);
		}

		System.out.println("this is after the loop");

		/*
		 * Questions 1 1 2 3 4 5 6 7 8 9 10
		 */
		System.out.println("******************* Question 1 *******************");
		int num1 = 1;
		while (num1 <= 10) {
			System.out.println(num1++);
		}

		/*
		 * Questions 2 1 3 5 7 9
		 */
		System.out.println("******************* Question 2 *******************");
		int num2 = 1;
		while (num2 <= 10) {
			System.out.println(num2);
			num2 += 2;
		}

		/*
		 * Questions 3 - 1 2 3 4 5
		 */
		System.out.println("******************* Question 3 *******************");
		int num3 = 1;
		while (num3 <= 5) {
			System.out.print(num3++ + "    ");
		}
		System.out.println();

		/*
		 * Questions 4 - 5 4 3 2 1
		 */
		System.out.println("******************* Question 4 *******************");
		int num4 = 5;
		while (num4 > 0) {
			System.out.print(num4-- + "    ");
		}
		System.out.println();

		boolean everythingIsPaid = false;  // <<<<<
		
//		if(the payment goes through and the balance is transferred to them){ 
//			everythingIsPaid= true
//		}
		
		while (!everythingIsPaid) {  // same as (everythingIsPaid != true)
//			keep asking them for payment
		}
		
		
		/*
		while(  all of the fields are not filled correctly  ){
		
		- ask user to fill the form
		 
		 - user fills the form
		 - user submits 
		 
		}
		
		>> event-controlled loop
		
		*/
	}
}
