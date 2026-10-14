package Encapsulation_Student_Example;

public class Main {

	public static void main(String[] args) {

		//creating an object for Student class
		Student obj_Student = new Student();
		obj_Student.setname("Malhar");
		System.out.println("Name : "+obj_Student.getname());
		
		obj_Student.setage(8);
		System.out.println("Age : "+obj_Student.getage());

	}

}
