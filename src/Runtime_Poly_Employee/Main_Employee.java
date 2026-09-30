package Runtime_Poly_Employee;

public class Main_Employee {

	public static void main(String[] args) {


		Employee e;
		
		e = new Manager();
		System.out.println(e.calculateSalary());
		
		e = new Developer();
		System.out.println(e.calculateSalary());
	}

}
