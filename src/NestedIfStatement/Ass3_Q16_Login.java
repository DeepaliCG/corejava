package NestedIfStatement;

import java.util.Scanner;

public class Ass3_Q16_Login {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter usename ");
		String a = sc.next();
		
		if (a.equals("admin"))
		{
			System.out.println("Enter password ");

			String b = sc.next();
			
			if(b.equals("1234"))
			{
				System.out.println("Login Successful");
			}
			else
			{
				System.out.println("Invalid Credentials");
			}
		}
		else
		{
			System.out.println("Login Denied");
		}
		
		
	}

}
