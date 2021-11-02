package assignment1;

public class AssignmentQuestions {
	public static void main(String[] args) {
////		int i = 1, j = 2, k = 3;
//		int m = i-- - j-- - k--;
//		System.out.println("i=" + i);
//		System.out.println("j=" + j);
//		System.out.println("k=" + k);
//		System.out.println("m=" + m);
//
//		int a = 1, b = 2;
//		System.out.println(--b - ++a + ++b - --a);

		int x = 001, y = 010, z = 100;
		int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
		
		
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
		System.out.println("i=" + i);
	}
}
