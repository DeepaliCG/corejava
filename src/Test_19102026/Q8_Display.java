package Test_19102026;

public class Q8_Display {
	
	void show(int a)
	{
		System.out.println("Integer a : "+a);
	}
	
	void show(double b)
	{
		System.out.println("Double : "+b);
	}
	
	void show(String c)
	{
		System.out.println("String : "+c);
	}

	public static void main(String[] args) {

		Q8_Display obj = new Q8_Display();
		obj.show(5);
		obj.show(23.45);
		obj.show("Hello");
		


	}

}
