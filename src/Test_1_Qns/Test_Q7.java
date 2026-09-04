package Test_1_Qns;

import java.util.Scanner;

public class Test_Q7 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int a = sc.nextInt();
		
		if (a>=0)
		{
			
			System.out.println("positive");
			if (a%2==0)
			{
				System.out.println("even ");
			}
			else
			{
				System.out.println("odd");
			}
		}
		else
		{
			System.out.println("Negative");
		}

	}

}
