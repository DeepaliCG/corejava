package Constructor_Example;

public class Person {
	
	String name;
	int age;
	
	//constructor
	Person()
	{
		name = "Malhar";
		age = 8;
	}
	
	//method
	void greet()
	{
		System.out.println("Happy "+age+"th Birthday "+name+".");
	}

	public static void main(String[] args) {


		//creating object
		Person obj_Person = new Person();
		obj_Person.greet();

	}

}
