package IfElseStatement;

import java.util.Scanner;

public class Ass3_Q6_Even_Odd_No {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int a = sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Number is Even");
			
		}
		else
		{
			System.out.println("Number is Odd");
		}

	}

}
