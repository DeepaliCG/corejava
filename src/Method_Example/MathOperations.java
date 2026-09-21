package Method_Example;

public class MathOperations {
	//static method
	static void multiplyNumbers(int para1, int para2)
	{
		System.out.println("Multiplication : "+(para1*para2));
	}
	
	//non static method
	void addNumbers(int para3, int para4)
	{
		System.out.println("Addition : "+(para3+para4));
	}

	
	public static void main(String[] args) {

		//passing arguments
		multiplyNumbers(3,5);

		//creating an object of class MathOperations
		MathOperations obj = new MathOperations();
		obj.addNumbers(2,4);
	
	}

}
