package Encapsulation_Employee_Example;

public class Main {

	public static void main(String[] args) {

		Employee obj_Employee = new Employee();
		obj_Employee.setEmpId(100);
		System.out.println("Employee ID : "+obj_Employee.getEmpId());
		
		obj_Employee.setSalary(10000);
		System.out.println("Salary : "+obj_Employee.getSalary());

	}

}
