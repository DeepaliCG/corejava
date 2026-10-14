package Test_09102026_Q6;

public class Main {

	public static void main(String[] args) {
		
		//creating object of Developer
		Developer obj_Developer = new Developer();
		obj_Developer.work();
		obj_Developer.displaydev();
		
		//creating an object of Tester
		Tester obj_Tester = new Tester();
		obj_Tester.work();
		obj_Tester.displaytest();
		
		//creating an object of Manager
		Manager obj_Manager = new Manager();
		obj_Manager.work();
		obj_Manager.displayman();

	}

}
