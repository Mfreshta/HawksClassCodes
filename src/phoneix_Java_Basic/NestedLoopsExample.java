package phoneix_Java_Basic;

public class NestedLoopsExample {
	public static void main(String[] args) {

		int x = 10;
		int y = 5;

		while (x > 0) {
			System.out.println("Otter " + x);
			while (y > 0) {
				System.out.println(y);
				y--;
			}
			y = 5;
			x--;
		}
		System.out.println("--------------------");
		int num1 = 1;
		int num2 = 1;

		while (num1 <= 10) {
			System.out.println(num1++);
		}
		
		
		

	}
}
