package javaBasics;

public class DoWhileExample {

	public static void main(String[] args) {
		
		
		int x = 0;
		
		System.out.println("while loop ");
		while(x > 0) {
			System.out.println(x++);
		}
		//While loop
		// 1. we check the condition
		// - if true - we run the body
		// - if not - nothing
		
		
		System.out.println("do while loop ");
		do {
			System.out.println(x++);
			if(x > 100)
				break;
		} while (x > 0);
		
//		do {
//			
//		} while (conditions);
		// do while 
		// 1. run the body of the loop 
		// 2. check the condition
		// - if true - we run the body
		// - if not - nothing
		
		// this means that we guarantee at least one execution of the body of the loop 
	}
	
	
}
