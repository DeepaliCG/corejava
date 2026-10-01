package Abstract_Payment_Example;

public class Main {

	public static void main(String[] args) {

		Payment obj_CreditCardPayment = new CreditCardPayment();
		obj_CreditCardPayment.makePayment(50.56);
		
		Payment obj_UPIPayment = new UPIPayment();
		obj_UPIPayment.makePayment(100.68);

	}

}
