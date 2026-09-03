package NestedIfStatement;

import java.util.Scanner;

public class Ass3_Q14_Assignment {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Marks : ");
		int a = sc.nextInt();
		
		
		if(a>=80)
		{
			System.out.println("Marks : "+a);
			System.out.println("Enter Maths Score : ");
			int b = sc.nextInt();
			
			if(b>=75)
			{
				System.out.println("Eligible");
			}
			else
			{
				System.out.println("Not Eligible");
			}
		}
		else
		{
			System.out.println("Not Eligible as marks are less than 80");
		}

	}

}
