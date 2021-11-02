package phoneix_Java_Basic;

public class SelectionBasics {
	public static void main(String[] args) {

		int age = 21;

		if (age >= 17) {
			System.out.println("You can drive now, yay!");
		} else {
			System.out.println("You can not drive!");
		}

		// >=95 - A+
		// 90-94 - A-

		// 80-89 - B
		// 70-79 - C
		// 60- 69 - D
		// <60 - F

		double grade = 78;
		System.out.println(grade);

		if (grade >= 90) {
			System.out.print("A");
			if (grade >= 95) {
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		} else if (grade >= 80) {
			System.out.print("B");
			if (grade >= 85) {
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		} else if (grade >= 70) {
			System.out.print("C");
			if (grade >= 75) {
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		} else if (grade >= 60) {
			System.out.print("D");
			if (grade >= 65) {
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		} else {
			System.out.println("F");
		}

		System.out.println("---------------------------");

		if (grade >= 95) {
			System.out.println("A+");
		} else if (grade >= 90) {
			System.out.println("A-");
		} else if (grade >= 85) {
			System.out.println("B+");
		} else if (grade >= 80) {
			System.out.println("B-");
		} else if (grade >= 75) {
			System.out.println("C+");
		} else if (grade >= 70) {
			System.out.println("C-");
		} else if (grade >= 65) {
			System.out.println("D+");
		} else if (grade >= 60) {
			System.out.println("D-");
		} else {
			System.out.println("F");
		}

	}
}
