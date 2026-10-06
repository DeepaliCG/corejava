package Interface_Ecomm_Example;

public class Main_ECommerce {

	public static void main(String[] args) {
		
		ECommerce obj_Amazon = new Amazon();
		obj_Amazon.placeOrder("Tshirt", 2);
		
		ECommerce obj_Flipkart = new Flipkart();
		obj_Flipkart.placeOrder("Jens", 4);

	}

}
