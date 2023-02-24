package week3day1;

public class AxisBank extends BankInfo {
	
	@Override
	
	public void deposit() {
		System.out.println("Deposit method from AxisBank class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AxisBank a= new AxisBank();
		a.deposit();
		a.fixed();
		a.saving();

	}

}
