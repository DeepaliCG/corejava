package Test_09102026_Q1;

public class Amazon implements ECommerce{

	@Override
	public void placeOrder(String item, int quantity) {
		
		System.out.println("Order placed on Amazon: item "+item+" quantity "+quantity);
		
	}
	

}
