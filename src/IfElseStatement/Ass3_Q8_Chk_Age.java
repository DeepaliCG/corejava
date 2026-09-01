package IfElseStatement;

import java.util.Scanner;

public class Ass3_Q8_Chk_Age {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age : ");
		int a = sc.nextInt();
		
		if(a>=18)
		{
			System.out.println("Allowed to Drive");
		}
		else
		{
			System.out.println("Not Allowed");
		}

	}

}
