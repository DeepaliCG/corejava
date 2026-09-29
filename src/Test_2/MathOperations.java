package Test_2;

public class MathOperations {


	//static
	public static void multiplyNumbers(int a,int b)
	{
		System.out.println(a*b);
	}
	
	//non static
	public void addNumbers (int c,int d)
	{
		System.out.println((c+d));
	}
	
	public static void main(String[] args) {

		//creating object of class for non static
		MathOperations obj_MathOperations = new MathOperations();
		obj_MathOperations.addNumbers(4, 6);
		
		//calling static method
		multiplyNumbers(4, 6);
	}

}
