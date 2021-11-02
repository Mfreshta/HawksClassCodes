package phoneix_Java_Basic;

public class CastingExamples {
	public static void main(String[] args) {

		int x = (int) 5.0;

		double num = 10.9;

		System.out.println((int) num);

		double num2 = x / 2.0;

		System.out.println(num2);

		int num3 = 10;
		num3 += 10; // 20
		num3 = num3 + 10; // 30
		System.out.println(num3);

		int num5 = 5;

		num5 *= 10;
		// num5 = 5 * 10;

		num5 %= 2; // num5 = 50 % 2

		System.out.println(num5);

	}
}
