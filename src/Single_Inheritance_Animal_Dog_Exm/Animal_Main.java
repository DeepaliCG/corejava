package Single_Inheritance_Animal_Dog_Exm;

public class Animal_Main {

	public static void main(String[] args) {


		Dog obj_Dog = new Dog(); // creating object for child
		obj_Dog.animal_name = "Tommy";// assigning value to parent variable
		obj_Dog.eat(); //accessing method from parent class
		obj_Dog.bark(); //accessing method from child class

	}

}
