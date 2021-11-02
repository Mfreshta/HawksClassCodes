package assignment1;

public class Question2 {
	public static void main(String[] args) {

		String[] names = new String[5];
		
		names[0] = "Book";
		names[1] = "Testing";
		names[2] = "I am going to get a job";
		names[3] = "Learning";
		names[4] = "My code works";

		Question2 obj = new Question2();
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(obj.revString(names[i]));
		}
		

	}

	public String revString(String str) {
		// to get the length of the word
		int lengthOfWord = str.length();
		String rev = "";

		if (lengthOfWord % 2 == 0) {
			// even
			// Book 4
			// 0123
			// to get the last index, you say length()-1
			// to get the second from last index, you can say length()-2
			for (int i = lengthOfWord - 2; i >= 0; i--) {
				rev += str.charAt(i);
			}

		} else {
			// odd
			// Books
			// 01234

			for (int i = lengthOfWord - 1; i >= 0; i--) {
				rev += str.charAt(i);
			}
		}

		// get a word,
		// check the length of
		// if odd - reverse the string
		// if even - remove the last char and then reverse

		return rev;
	}

}
