package Method_Example;

public class CopyCounter {

	public static void main(String[] args) {

		//calling non static method
		counter obj = new counter();
		obj.incrementNonStatic();
		
		//calling static method
		counter.incrementStatic();



	}

}
