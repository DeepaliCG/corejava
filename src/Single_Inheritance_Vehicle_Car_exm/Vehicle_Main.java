package Single_Inheritance_Vehicle_Car_exm;

public class Vehicle_Main {

	public static void main(String[] args) {


		//creating an object of child class
		Car obj_Car = new Car();
		
		//initializing variable
		obj_Car.name = "Mercedes";

		//calling methos from parent
		obj_Car.start();
		
		//calling methods from child class
		obj_Car.drive();
	}

}
