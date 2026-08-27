package variables;

public class Ass1_Q12_Swap_Without_Third_var {

	public static void main(String[] args) {


		int a = 10;
		System.out.println("Before swap : value of a : "+a);
		
		int b = 5;
		System.out.println("Before swap : value of b : "+b);
		
		a= a+b; //10+5 = 15
		b=a-b; //15-5 = 10
		a=a-b; //15-10 = 5
		
		System.out.println("After swap : value of a : "+a);
		System.out.println("After swap : value of b : "+b);
		
		

	}

}
