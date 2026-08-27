package variables;

public class Ass1_Q11_Swaping_With_Third_Var {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.println("Before swap : Value of a : "+a);
		
		int b = 20;
		System.out.println("Before swap : Value of b : "+b);
		
		int c;
		
		c = a;
		a=b;
		b=c;
		
		System.out.println("After swap : Value of a : "+a);
		System.out.println("After swap : Value of b : "+b);

	}

}
