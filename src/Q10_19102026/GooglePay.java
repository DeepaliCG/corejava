package Q10_19102026;

public class GooglePay implements  PaymentApp{

	@Override
	public void pay(double amount) {

		System.out.println("GooglePay : "+amount);
		
	}
	

}
