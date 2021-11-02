package assignment1;

public class Question4 {
	public static void main(String[] args) {

		int[] nums = { 15, 5, 13, 5, 1, 4, 2, 5, 36, 3, 4, 2 };

		int largest = nums[0];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > largest) {
				largest = nums[i];
			}
			System.out.println(nums[i]);
		}

		System.out.println("Largest: " + largest);
		System.out.println("--------------------------------");
		char[] chars = { 'c', 's', 'c', 's', 'r', 'g', 'a', 'a', 'd', 'g' };
		// we need to loop through the array
		// check to see if current index is equal to the previous index
		for (int i = 1; i < chars.length; i++) {
			if (chars[i] == chars[i - 1]) {
				System.out.println("found it '" + chars[i] + "' char is duplicate in sequence on indexes " + i + " and "
						+ (i - 1));
				break;
			}
		}

	}
}
