package Ifstatement;

import java.util.Scanner;

public class Ass3_Q4_uppercase_letter {

	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Character Value : ");
		char a = sc.next().charAt(0);
		
		if (a >= 'A' && a <= 'Z')
		{
			System.out.println("Uppercase Letter");
		}

	}

}
