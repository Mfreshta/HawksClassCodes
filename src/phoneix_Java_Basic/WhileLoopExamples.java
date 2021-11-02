package phoneix_Java_Basic;

public class WhileLoopExamples {
	public static void main(String[] args) {

		int x = 1;

		while (x < 10) {
			System.out.println(x++);
		}

		System.out.println("---------------");
		// 10 - 6
		int num1 = 10;
		while (num1 >= 6) {
			System.out.println(num1--);
		}
		System.out.println("---------------");
		// 3 - 11 increase by 2
		int num2 = 3;
		while (num2 <= 11) {
			System.out.println(num2);
			num2 += 2;
		}
		System.out.println("---------------");
		int num3 = 1;
		int num4 = 1;
		while (num3 <= 5) {
			while (num4 <= 5) {
				System.out.print(num4);
				num4++;
			}
			System.out.println();
			num4 = 1;
			num3++;
		}
		System.out.println("---------------");
		int num5 = 5;
		int num6 = 5;
		while (num5 > 0) {
			while (num6 >= num5) {
				System.out.print(num6 + " ");
				num6--;
			}
			System.out.println();
			num6 = 5;
			num5--;
		}
		System.out.println("---------------");

		char myChar = 'a';

		while (myChar <= 'z') {
			System.out.print((int) myChar + "-" + myChar + ", ");
			myChar++;
		}

		System.out.println("\nEnd of the program");
	}
}
