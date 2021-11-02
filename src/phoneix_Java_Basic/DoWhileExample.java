package phoneix_Java_Basic;

public class DoWhileExample {
	public static void main(String[] args) {

		int x = 10;
		
		System.out.println("result of while loop ");

		while (x > 10 && x <= 20) {
			System.out.println(x++);
		}

		
		System.out.println("result of do while loop ");
		
		do {
			System.out.println(x--);
		} while (x > 10 && x <= 20);


	}
}
