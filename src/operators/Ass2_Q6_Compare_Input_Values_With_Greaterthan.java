package operators;

import java.util.Scanner;

public class Ass2_Q6_Compare_Input_Values_With_Greaterthan {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Enter value of a : ");
		int a = sc.nextInt();
		
		System.out.println("Enter value of b : ");
		int b = sc.nextInt();
		
		System.out.println("Output : a > b : "+(a>b));
	}

}
