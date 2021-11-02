package CalcExample;

public class CalculatorExample {

	public CalculatorExample() {

	}

	public double getSum(double a, double b) {
		System.out.println(a + " + " + b + " = " + (a + b));
		return a + b;
	}

	public double getDiv(double a, double b) {
		if (b == 0) {
			System.out.println("Can not divide by zero");
			return -1;
		} else {
			System.out.println(a + " / " + b + " = " + (a / b));
			return a / b;
		}
	}

	public double getMult(double a, double b) {
		System.out.println(a + " * " + b + " = " + (a * b));
		return a * b;
	}
	public double getsubtraction(double a, double b) {
		System.out.println(a + " - " + b + " = " + (a - b));
		return a - b;
	}

	public double getTaxAmount(double amount, double percent) {
		System.out.println("For amount of $" + amount + " and tax rate of %" + percent + " your tax amount will be $"
				+ (amount * percent / 100));
		return amount * percent / 100;
	}
	
	

}
