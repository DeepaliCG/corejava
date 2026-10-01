package Abstract_Payment_Example;

public class CreditCardPayment extends Payment {
	
	@Override void makePayment(double amount)
	{
		System.out.println("Paid Amount "+amount+" using Credit Card");
	}

}
