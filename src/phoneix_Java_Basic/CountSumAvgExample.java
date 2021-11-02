package phoneix_Java_Basic;

public class CountSumAvgExample {

	public static void main(String[] args) {

		// its going take an array of numbers
		// it will give us the following info
		// count
		// sum of all of the number in the array
		// min
		// max
		// avg - count

		int[] numbers = { 1, 5, 478, 1, 58, 1, 85, 12, 87, 3, 685, 12, 871, 2, 8721, 5, 6 };

		int count = numbers.length;
		int sum = 0;
		int min = numbers[0];
		int max = numbers[0];
		double avg = 0;

		for (int i = 0; i < numbers.length; i++) {
			// to find sum
			sum = sum + numbers[i];

			// to find min
			if (numbers[i] < min) {
				min = numbers[i];
			} else if (numbers[i] > max) {
				max = numbers[i];
			}
		}

		// to find the avg
		avg = sum / count;
		
		
		System.out.println("--------------------");
		System.out.println("Count: " + count);
		System.out.println("Sum: " + sum);
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Avg: " + avg);

	}

}
