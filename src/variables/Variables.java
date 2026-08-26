package variables;

public class Variables {
	
	//instance variable
	int a = 50;
	
	//static variable
	static int b = 100;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// local variable
				int c = 10;
				
				System.out.println("Local variable = "+c+" Static variable = "
						+b);
				
				Variables d = new Variables();
				System.out.println("Instance Variable = "+d.a);


		
	}

}
