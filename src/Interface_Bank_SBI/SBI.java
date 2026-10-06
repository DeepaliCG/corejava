package Interface_Bank_SBI;

public class SBI implements Bank{

	@Override
	public void deposite(int deposite_amt) {

		System.out.println(deposite_amt+"/- has been deposited in SBI account");
		
	}

	@Override
	public void withdraw(int withdraw_amt) {
		
		System.out.println(withdraw_amt+"/- has been withdrawn from SBI account");
		
	}
	

}
