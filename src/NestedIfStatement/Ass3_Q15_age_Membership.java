package NestedIfStatement;

import java.util.Scanner;

public class Ass3_Q15_age_Membership {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int a = sc.nextInt();
		
		if(a>=18)
		{
			System.out.println("Do you have membership card?");
			boolean b = sc.nextBoolean();
			
			if (b==true)
			{
				System.out.println("Entry Allowed");
			}
			else
			{
				System.out.println("Entry Denied");
			}
		}
		else
		{
			System.out.println("Entry Denied : age is >18");
		}

	}

}
