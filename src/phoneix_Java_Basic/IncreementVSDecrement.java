package phoneix_Java_Basic;

import javax.annotation.processing.SupportedSourceVersion;

public class IncreementVSDecrement {
	public static void main(String[] args) {

		// increment vs decrement
		// increment = increase by one
		// decrement = decrease by one

		// pre vs post
		// pre = increase first then use the variable
		// post = use the variable then increase it

		int x = 5;
		x = x + 1;
		x++;
		x--;
		x *= 2;
		int y = x + 10;
		y = x++;
		System.out.println("what is this value => " + ++x);
		System.out.println(y);
		
		System.out.println("-------------------------------");
		
		int temp1 = 10;
		
		System.out.println(temp1 + 1);
		System.out.println(temp1++);
		System.out.println(temp1);
		
		System.out.println("-------------------------------");
		
		int z = 5;
		System.out.println(z);//5
		System.out.println(z++);//5
		// the value of z is not 5+1=6
		
		
		// 1 + 1 = 2
		
		
		int num = 1;
		++num; // pre increment (increase first - then use in) 
		num++; // post increment (use the current value in this line and then increase it)
		--num; // pre decrement (decrease first and then use it here)
		num--; // post decrement (use the current value in this line and then decrease it)
		
		System.out.println(num);
		int num2 = 10;
		num2++; 
		num2 = num2++ - --num2;
		System.out.println(num2 - 5);
		
		
		
		System.out.println("-------------------------------");
		
		int num3 = 21;
		
		num3 = num3++ + 10 - 2;
		num3 *= ++num3;
		
		System.out.println("the value of nume3 is " + num3);
		
		System.out.println("-------------------------------");
		int num4 = 19;
		int num5 = num4 + 58;
		num4 = num5;
		num5 = ++num4 + 10 - 5;
		num4 = num4 +1;
		System.out.println("value of num4 is " + num4);
		System.out.println("value of num5 is " + num5);
		
		
		
	}
}
