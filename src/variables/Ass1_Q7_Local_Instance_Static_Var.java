package variables;

public class Ass1_Q7_Local_Instance_Static_Var {
	
	//instance variable
	int a = 50;
	
	//static variable
	static int b = 100;

	public static void main(String[] args) {
		
		// local variable
		int c = 10;
		
		System.out.println("Local variable = "+c+" Static variable = "
				+b);
		
		Ass1_Q7_Local_Instance_Static_Var d = new Ass1_Q7_Local_Instance_Static_Var();
		System.out.println("Instance Variable = "+d.a);

	}

}
