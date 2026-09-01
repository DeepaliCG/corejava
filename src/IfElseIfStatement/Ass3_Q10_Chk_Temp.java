package IfElseIfStatement;

import java.util.Scanner;

public class Ass3_Q10_Chk_Temp {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature");
		int temp = sc.nextInt();
		
		if(temp>30)
		{
			System.out.println("Hot");
		}
		else if (temp>=20)
		{
			System.out.println("Warm");
		}
		else if (temp >=10)
		{
			System.out.println("Cold");
		}
		else 
		{
			System.out.println("Very Cold");
		}

	}

}
