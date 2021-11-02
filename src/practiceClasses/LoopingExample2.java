package practiceClasses;

public class LoopingExample2 {
	public static void main(String[] args) {

	
	// how to reverse a string
		
		
		String text = "testing"; // this is our string value

		int i = text.length() - 1; // this is when we get the length - 1 which will give us the last index

		while (i >= 0) { // run for as long as i >= 0, which is the last index we want to visit
			System.out.print(text.charAt(i--)); // print the char at that index and then reduce i by 1
		}
		

	}
}
