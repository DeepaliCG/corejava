package Polymorphism_Method_Overloading;

public class overloading_Wid_Diff_Datatypes {

	//creating method with 2 parameters but diff datatypes
	void multiply(int a,int b)
	{
		System.out.println(a*b);
	}
	
	void multiply(double a,double b)
	{
		System.out.println(a*b);
	}
	
	
	public static void main(String[] args) {

		//creating an object of class
		overloading_Wid_Diff_Datatypes obj = new overloading_Wid_Diff_Datatypes();
		//multuply method with double datatype
		obj.multiply(1.2, 5.3);
		//multiply method with int datatype
		obj.multiply(3, 5);


	}

}
