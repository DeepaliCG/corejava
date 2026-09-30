package Polymorphism_Method_Overloading;

public class Calculator {

	void add(int a, int b)
	{
		System.out.println("add method with 2 int parameters : "+(a+b));
	}
	
	void add(double a, double b)
	{
		System.out.println("add method with 2 double parameters : "+(a+b));
	}
	
	void add(int a, int b, int c)
	{
		System.out.println("add method with 3 int parameters : "+(a+b+c));		
	}
	
	void add(String a, String b)
	{
		System.out.println("add method with 2 string parameters : "+a+" "+b);
	}
	
	public static void main(String[] args) {

		Calculator obj_Calculator = new Calculator();
		obj_Calculator.add(3, 1);
		obj_Calculator.add(3.4, 6.7);
		obj_Calculator.add(4, 6, 8);
		obj_Calculator.add("Have a","Good Day");

	}

}
