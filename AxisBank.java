package assign.ment3;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("the amount is deposited");
	}

	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.deposit();
		obj.fixed();
		obj.saving();
				

	}

}
