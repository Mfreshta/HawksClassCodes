package phoneix_Java_Basic;

public class SelectionExample3 {
	public static void main(String[] args) {

		int x = 10;
		int y = 15;

		boolean z = !(!(x>y) || (x+y)>50 && true ^ !false);
		System.out.println("this is the result: " + z);
		
		
		
		
		
		
//		System.out.println(x == y);

		System.out.println(x > y); // False
		System.out.println(x < y); // False
		System.out.println(x >= y); // True
		System.out.println(x <= y); // True

		/*
		 * > more than < less than >= more than and equal to <= less than and equal to
		 * 
		 */

		// logical operators
		// AND &&  we need both of the conditions to be true for the result to be true
		// OR ||   we only need one of the conditions to be true for the result to be true
		// NOT !   reverses the boolean

		int num1 = 10;
		int num2 = 20;
		int num3 = 30;

		if (num1 > num2 || num3 < 50) {
			System.out.println("true block");
		}
		
		
		
		int temp = 3;
		System.out.println(temp > 5 || ++temp > 50);
		System.out.println(temp);
		
		//             F          F
		boolean b = 57 < 17 || !(true) && 'c' != 'd' || (true ^ false); 
		
		System.out.println("this is the answer to b " + b );
		
		
		if(false)
			System.out.println("this is single true statement format");
		
		
		if(true) {
			System.out.println("something");
		}
		
		
	}
}
