package Runtime_Poly_Vehicle;

public class Main_Vehicle {

	public static void main(String[] args) {

		//creating reference of parent class
		Vehicle v;

		v = new Car();
		System.out.println(v.speed());
	
		v = new Bike();
		System.out.println(v.speed());
	}

}
