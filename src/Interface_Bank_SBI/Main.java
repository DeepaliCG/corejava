package Interface_Bank_SBI;

public class Main {

	public static void main(String[] args) {
		
		Bank obj_SBI = new SBI();
		obj_SBI.deposite(5000);
		obj_SBI.withdraw(1000);

	}

}
