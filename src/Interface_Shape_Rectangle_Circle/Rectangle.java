package Interface_Shape_Rectangle_Circle;

public class Rectangle implements Shape{

	int len = 3;
	int wid = 5;
	
	@Override
	public void area() {
		System.out.println("Area of Rectangle : "+(len*wid));
		
	}

	
}
