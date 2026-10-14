package Test_09102026_Q2;

public class CreditCardPayment extends Payment{

	@Override
	void makePayment(double amount) {

		System.out.println("Paid "+amount+"/- using Credit Card");
		
	}

}
