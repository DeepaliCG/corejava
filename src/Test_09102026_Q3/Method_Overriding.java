package Test_09102026_Q3;

public class Method_Overriding {
	
	void printValue(int num)
	{
		System.out.println("Integer Value : "+num);
	}
	
	void printValue(double num)
	{
		System.out.println("Double Value "+num);
	}
	
	void printValue(String text)
	{
		System.out.println("String Value "+text);
	}
	
	void printValue(boolean flag)
	{
		System.out.println("Boolean Flag "+flag);
	}

	public static void main(String[] args) {
		
		//creating an object of class Method_Overriding
		Method_Overriding obj_Method_Overriding = new Method_Overriding();
		obj_Method_Overriding.printValue(10);
		
		obj_Method_Overriding.printValue(400.74);
		
		obj_Method_Overriding.printValue("Hello");
		
		obj_Method_Overriding.printValue(true);

	}

}
