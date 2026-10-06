package Interface_Vehicle;

public class Main_Vehicle_Fuel {

	public static void main(String[] args) {
		
		Car obj_Car = new Car();
		obj_Car.start();
		obj_Car.refuel(100);
		
		Bike obj_Bike = new Bike();
		obj_Bike.start();
		obj_Bike.refuel(50);
	}

}
