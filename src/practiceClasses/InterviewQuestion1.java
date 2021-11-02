package practiceClasses;

public class InterviewQuestion1 {

	public static void main(String[] args) {

		InterviewQuestion1 obj = new InterviewQuestion1();

		System.out.println(obj.freedomSum(1, 2, 3));
		System.out.println(obj.freedomSum(1, 2, 10));
		System.out.println(obj.freedomSum(1, 10, 3));
	}

	public int freedomSum(int a, int b, int c) {
		if (a == 10) {
			return 0;
		} else if (b == 10) {
			return a;
		} else if (c == 10) {
			return a + b;
		} else {
			return a + b + c;
		}
	}

}
