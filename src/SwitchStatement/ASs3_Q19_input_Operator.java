package SwitchStatement;

import java.util.Scanner;

public class ASs3_Q19_input_Operator {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Integer value");
		int a = sc.nextInt();
		
		System.out.println("Enter Second Integer Value");
		int b = sc.nextInt();
		
		System.out.println("Enter Operator value");
		char c =sc.next().charAt(0);

		switch(c)
		{
		case '+':System.out.println(a+b);break;
		case '-':System.out.println(a-b);break;
		case '*':System.out.println(a*b);break;
		case '/':System.out.println(a/b);break;
		default:System.out.println("Invalid Operator");
		}
	}

}
