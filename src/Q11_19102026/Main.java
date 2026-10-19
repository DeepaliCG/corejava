package Q11_19102026;

public class Main {

	public static void main(String[] args) {


		//creating object of Developer
		Developer obj_dev = new Developer();
		obj_dev.work();
		obj_dev.dev_work();
		
		//creating an object of tester
		Tester obj_test = new Tester();
		obj_test.work();
		obj_test.test_work();
		
		//creating an object of MAnager
		Manager obj_man = new Manager();
		obj_man.work();
		obj_man.man_work();

	}

}
