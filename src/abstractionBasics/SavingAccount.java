package abstractionBasics;

public class SavingAccount extends Reporting implements BankAccount{

	public static void main(String[] args) {
		
		SavingAccount obj = new SavingAccount();
		
		obj.someMethod();
	}
	
	
	@Override
	public boolean deposit(double amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void someAbstractMethod() {
		// TODO Auto-generated method stub
		
	}

}
