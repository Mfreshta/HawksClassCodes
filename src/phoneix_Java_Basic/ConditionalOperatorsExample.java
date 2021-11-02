package phoneix_Java_Basic;

public class ConditionalOperatorsExample {
	public static void main(String[] args) {

		int x = 20;
		int y = 15;

		System.out.println(x > y ? "X is Bigger" : "Y is Bigger");

		if (x > y) {
			System.out.println("X is Bigger");
		} else {
			System.out.println("Y is Bigger");
		}

		boolean z = x > y ? true : false;

		int w = x > y ? 100 : 200;
	}
}
