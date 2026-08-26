package variables;

import java.util.Scanner;

public class Ass1_Q6_Concat_Multiple_Inputs {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter yout Name ");
		String name = sc.next();
		
		System.out.println("Enter your Course name ");
		String course = sc.next();
		
		System.out.println("Enter your Age");
		int age = sc.nextInt();
		
		System.out.println("My name is "+name
				+". My course name is "+course
				+" and my age is "+age
				);
		

	}

}
