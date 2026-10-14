package Test_09102026_Q2;

public class Main {

	public static void main(String[] args) {
		
		//creating reference
		Payment obj_UPIPayment = new UPIPayment();
		obj_UPIPayment.makePayment(500.78);
		
		Payment obj_CreditCardPayment = new CreditCardPayment();
		obj_CreditCardPayment.makePayment(100.56);

	}

}
