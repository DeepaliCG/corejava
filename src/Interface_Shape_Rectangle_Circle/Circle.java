package Interface_Shape_Rectangle_Circle;

public class Circle implements Shape{

	int red = 8;
	
	@Override
	public void area() {
		System.out.println("Area of Circle : "+(red*3.14));
		
	}
	

}
