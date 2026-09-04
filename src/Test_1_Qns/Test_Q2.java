package Test_1_Qns;

import java.util.Scanner;

public class Test_Q2 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first Integer");
		int a = sc.nextInt();
		
		System.out.println("Enter second Integer");
		int b = sc.nextInt();
		
		int c;
		
		System.out.println("Before Swap : Value of a : "+a+" b : "+b);
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("After Swap : Value of a : "+a+" b : "+b);
		
	}

}
