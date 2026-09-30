package Runtime_Poly_bank_exm;

public class Main_Bank {

	public static void main(String[] args) {

		//creating parent class reference
		Bank b;
		
		b= new SBI();
		System.out.println("Rate of Ineterest for SBI : "+b.getRateOfInterest());

		b = new ICICI();
		System.out.println("Rate of Ineterest for ICICI : "+b.getRateOfInterest());
		
		b = new AXIS();
		System.out.println("Rate of Ineterest for AXIS : "+b.getRateOfInterest());
		
	}

}
