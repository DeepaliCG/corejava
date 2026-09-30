package Polymorphism_Method_Overloading;

public class Method_Overloading_Wid_Diff_Noof_Para {

	//add methos with 2 parameters
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	//add method with 3 parameters
	void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
	
		//creating an object of class
		Method_Overloading_Wid_Diff_Noof_Para obj = new Method_Overloading_Wid_Diff_Noof_Para();
		obj.add(10, 30);
		obj.add(20, 30,40);
		
	}

}
