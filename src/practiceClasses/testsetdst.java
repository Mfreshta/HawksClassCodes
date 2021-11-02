package practiceClasses;

import java.util.Random;

public class testsetdst {
	public static void main(String[] args) {
		int[][][] data = new int[2][15][3];
		int number = 1;
		
		Random rand = new Random();
		// Obtain a number between [0 - 49].
		int n = rand.nextInt(50);

		// Add 1 to the result to get a number from the required range
		// (i.e., [1 - 50]).
		n += 1;

		for (int table = 0; table < data.length; table++) {
			for (int row = 0; row < data[table].length; row++) {
				for (int cell = 0; cell < data[table][row].length; cell++) {
					data[table][row][cell] = rand.nextInt(50);
				}
			}
		}

		for (int[][] table : data) {
			for (int[] row : table) {
				for (int cell : row) {
					System.out.print(cell + "\t");
				}
				System.out.println();
			}
			System.out.println("---------------");
		}
		

		
	}
}
