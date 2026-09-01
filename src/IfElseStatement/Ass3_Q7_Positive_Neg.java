package IfElseStatement;

import java.util.Scanner;

public class Ass3_Q7_Positive_Neg {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int a = sc.nextInt();
		
		if(a>=0)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("Negative");
		}

	}

}
