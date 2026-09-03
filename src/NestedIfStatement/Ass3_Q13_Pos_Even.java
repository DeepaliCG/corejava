package NestedIfStatement;

import java.util.Scanner;

public class Ass3_Q13_Pos_Even {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Value");
		int a = sc.nextInt();
		
		if (a>0)
		{
			System.out.println("Positive Number");
			if(a%2==0)
			{
				System.out.println("Number is Positive and Even");
			}
			else
			{
				System.out.println("Number is Odd");
			}

		}
		
		else
		{
			System.out.println("Negative Number");
		}
			}

}
