package practiceClasses;

public class LoopsExamples {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		String[] d = new String[5];
		d[0] = "testing";
		d[1] = "if";
		d[2] = "I";
		d[3] = "undrestand";
		d[4] = "this";

		for (String x : d) {
			System.out.print(x + " ");
		}

		System.out.println();

		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}

		// do the same thing in a while loop
		System.out.println();
		int num = 0;
		while (num < d.length) {
			System.out.print(d[num++] + " ");
		}

		System.out.println("\n*********************************");
		int[][][] data = new int[2][15][3];
		int number = 1;

		for (int table = 0; table < data.length; table++) { // this loop is going through the 3rd dimension / 2 two
															// tables
			for (int row = 0; row < data[table].length; row++) { // this is going through each row of the tables
				for (int cell = 0; cell < data[table][cell].length; cell++) { // going through the cells of each row
					data[table][row][cell] = number++; // we assign the number to that index and then increase it by one
				}
			}
		}

		
		for (int[][] table : data) { // this goes through the 3rd dim and returns a 2dim on each iteration
			for (int[] row : table) { // this goes through 2dim and returns 1dim on each iteration
				for (int cell : row) { // this goes through 1dim and returns int on each iteration
					System.out.print(cell + "\t");// printing the cell value and one space in the same line
				}
				System.out.println(); // going to the next line
			}
			System.out.println("------------------"); // this adds a separator between tables
		}
		
		
		
		

	}
}
