package phoneix_Java_Basic;

public class Variables {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 8;
		int num3 = 13;
		
		
		System.out.println("num1 before =  " + num1);
		num1 = num2;
		System.out.println("num1 after =  " + num1);
		num2 = num3;
		
		System.out.println("num3 before  = " + num3);
		num3 = num1;
		System.out.println("num3 after  = " + num3);
		
		System.out.println(num3);
		
		
		
		float temp1 = 1.123456789123456789123456789123456789f;
		double temp2 = 1.123456789123456789123456789123456789;
		
		
		System.out.println(temp1);
		System.out.println(temp2);
		
		double income = 70000;
		double taxRate = 2.5;
		
		double taxAmount = income * taxRate /100;
		System.out.println(taxAmount);
		
		
		
		
	}

}