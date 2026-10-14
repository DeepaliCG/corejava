package Test_09102026_Q2;

public class UPIPayment extends Payment{

	@Override
	void makePayment(double amount) {
		System.out.println("Paid "+amount+"/- using UPI");
		
	}
	

}
