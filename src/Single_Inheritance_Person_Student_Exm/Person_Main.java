package Single_Inheritance_Person_Student_Exm;

public class Person_Main {

	public static void main(String[] args) {


		//creating an object for child class
		Student std = new Student();
		//assigning values of variable
		std.name ="Malhar";
		std.age= 8;
		std.rollno = 10;
		std.marks = 100;
		
		std.person_display();
		std.Student_Display();

	}

}
