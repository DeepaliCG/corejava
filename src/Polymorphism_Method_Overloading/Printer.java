package Polymorphism_Method_Overloading;

public class Printer {

	void printValue(int num)
	{
		System.out.println("printing int value : "+num);
	}
	
	void printValue(double num)
	{
		System.out.println("printing double value : "+num);
	}
	
	void printValue(String text)
	{
		System.out.println("printing string value : "+text);
	}
	
	void printValue(boolean flag)
	{
		System.out.println("printing boolean value : "+flag);
	}
	
	public static void main(String[] args) {

		Printer obj_Printer = new Printer();
		obj_Printer.printValue(3);
		obj_Printer.printValue(3.111111);
		obj_Printer.printValue("Hello");
		obj_Printer.printValue(true);

		
	}

}
