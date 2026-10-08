package Encapsulation_Employee_Example;

public class Employee {
	
	private int empid;
	private double sal;
	
	public void setEmpId(int id) 
	{
		empid = id;
	}
	
	public void setSalary(double salary)
	{
		sal = salary;
	}
	
	public int getEmpId()
	{
		return empid;
	}
	
	public double getSalary()
	{
		return sal;
	}

}
