package phoneix_Java_Basic;

public class ScopeExamples {
	public static void main(String[] args) {

		int x = 10;

		if (x > 5) {
			int y = 15;
			System.out.println(x + y);

		} else {
//			System.out.println(x + y); <<<==== the variable y is not accessible since its created in another block 
		}

	}
}
