package phoneix_Java_Basic;

public class DimensionalArraysExamples {
	public static void main(String[] args) {

		int[][] numbers = new int[10][5];

		numbers[0][0] = 1;
		numbers[5][3] = 5;

		// [row][col]

		// this loop goes through all of the rows, we have 10 rows
//		for(int row = 0; row < numbers.length; row++) {
//			// this goes through each row. we have five cols in each row
//			for(int col = 0; col < numbers[row].length ; col++) {
//				System.out.print(numbers[row][col] + " ");
//			}
//			System.out.println();
//		}

//		String [][] userPass = {{"user1_asdfas", "pass1_dsgdsfe"}, {"user2_asdfas", "pass2_dsgdsfe"}, {"user3_asdfas", "pass3_dsgdsfe"}};

		String[][] userPass = new String[10][2];

		userPass[0][0] = "user1";
		userPass[0][1] = "pass1";

		userPass[1][0] = "user2";
		userPass[1][1] = "pass2";

		userPass[2][0] = "user3";
		userPass[2][1] = "pass3";

		userPass[3][0] = "user4";
		userPass[3][1] = "pass4";

		userPass[4][0] = "user5";
		userPass[4][1] = "pass5";

		userPass[5][0] = "user6";
		userPass[5][1] = "pass6";

		userPass[6][0] = "user7";
		userPass[6][1] = "pass7";

		for (int i = 0; i < userPass.length; i++) { // outer loop - it goes through the rows
			for (int j = 0; j < userPass[i].length; j++) { // inner loop will go through the cells in that row
				System.out.print(userPass[i][j] + " ");
			}
			// after we go through each row, we go to the next line
			System.out.println();
		}

		int nums[][] = new int[7][4];

		int x = 1;
		// assigning the values to the array
		for (int i = 0; i < nums.length; i++) { // this loop goes through the rows
			for (int j = 0; j < nums[i].length; j++) { // this loop goes through the inner arrays/ cols
				nums[i][j] = x++;
			}
		}
		
		// printing the values in the array using a foreach loop
		for (int[] row : nums) { // this foreach loop goes through the rows
			for (int cell : row) { // this foreach goes through the valuers in the inner arrays
				System.out.print(cell + "\t");
			}
			System.out.println();
		}
		

	}
}
