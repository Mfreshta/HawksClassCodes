package phoneix_Java_Basic;

public class SwwitchExample {
	public static void main(String[] args) {

		char myCharacteer = 'c';

		
		// when the case matches the key in the switch, we will start from there
		// we will stop when we see a break keyword or the end of the switch
		
		
		// in switch, if none of the cases matches the key, we will run the default bloc 
		switch (myCharacteer) {  // << the key for the switch 
		case 'a':
			System.out.println("the char is 'a' now");
			break;
		case 'b':
			System.out.println("the char is 'b' now");
			break;
		default:
			System.out.println("the char is neither 'a' nor 'b' now");
		}

	}
}
