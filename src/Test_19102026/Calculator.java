package Test_19102026;

public class Calculator {
	
	public static void subtract(int a, int b)
	{
		System.out.println("Substraction : "+(a-b));
	}

	public void divide(int a, int b)
	{
		
		System.out.println("Division : "+(a/b));
		
	}
	public static void main(String[] args) {

		//creating an object
		Calculator obj = new Calculator();
		obj.divide(4, 2);
		subtract(5, 1);

	}

}
