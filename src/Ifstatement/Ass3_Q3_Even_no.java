package Ifstatement;

import java.util.Scanner;

public class Ass3_Q3_Even_no {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		
		if (a%2==0)
		{
			System.out.println("Number is Even");
		}
	}

}
