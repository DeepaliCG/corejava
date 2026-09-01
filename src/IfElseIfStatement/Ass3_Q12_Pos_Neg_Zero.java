package IfElseIfStatement;

import java.util.Scanner;

public class Ass3_Q12_Pos_Neg_Zero {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Value");
		int a = sc.nextInt();
		
		if(a>0)
		{
			System.out.println("Positive");
		}
		else if (a< 0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Zero");
		}
	}

}
