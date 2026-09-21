package Constructor_Example;

public class Circle {

	int radius;
	
	Circle()
	{
		radius = 4;
	}
	
	void calculate_area
	()
	{
		float pi = 3.14f;
		float area = pi*(radius*radius);
		System.out.println("Area of Circle is "+area);
	}
	public static void main(String[] args) {

		//creating an object of constructor
		Circle obj_Circle = new Circle();
		obj_Circle.calculate_area();

		

	}

}
