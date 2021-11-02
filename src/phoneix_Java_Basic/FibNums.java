package phoneix_Java_Basic;

public class FibNums {
	public static void main(String[] args) {

		// the first two numbers are 0 and 1, the next numbers are the sum of the 2 previous numbers
		int range = 50;
		int [] fibNumbers = new int [range]; // creating an array with size of 10
		fibNumbers[0] = 0; // assigning the first value 0
		fibNumbers[1] = 1; // assigning the second value 1
//		
//		for (int i = 2; i < fibNumbers.length; i++) { // this loop goes through the entire array 
//		 
//			fibNumbers[i] = fibNumbers[i-1] + fibNumbers[i-2];
//			System.out.println(fibNumbers[i]);
//		}
		
		
		
		// every number is the sum of all previous numbers - its not fib numbers
		int sum = 0;
		int [] numbers = new int [10];
		numbers[0] = 1;
		
		
		for (int i = 0; i < numbers.length -1; i++) {
			// calculate the sum 
			sum += numbers[i];
			
			numbers[i+1] = sum; 
			System.out.println(numbers[i]);
		}
		
		
		
		
		
		
		
		
	}
}
