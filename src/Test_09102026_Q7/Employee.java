package Test_09102026_Q7;

public class Employee {
	
	private int empId ;
	private double salary;
	
	
	//setter method for employee id
	public void setEmpId(int id)
	{
		empId = id;
	}
	
	
	//setter method for salary
	public void setSalary(double sal)
	{
		salary =  sal;
	}

	//getter method for employee id
	public int getEmpId()
	{
		return empId;
	}
	
	//getter method for salary
	public double getSalary()
	{
		return salary;
	}
	
	public static void main(String[] args) {
		
		//creating an object to access setter and getter methods
		Employee obj_Employee = new Employee();
		obj_Employee.setEmpId(100);
		System.out.println("Employee id : "+obj_Employee.getEmpId());
		
		obj_Employee.setSalary(5000);
		System.out.println("Employee Salary : "+obj_Employee.getSalary());
	}

}
