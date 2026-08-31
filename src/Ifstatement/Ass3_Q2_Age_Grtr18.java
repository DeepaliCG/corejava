package Ifstatement;

import java.util.Scanner;

public class Ass3_Q2_Age_Grtr18 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter Age of a Person : ");
		int a = sc.nextInt();
		
		if (a > 18)
		{
			System.out.println("Eligible to Vote");
		}

	}

}
