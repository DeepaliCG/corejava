package Test_2;

import java.util.Scanner;

public class Test_2_Qns_2 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks");
		int imarks = sc.nextInt();

		if(imarks >=40 && imarks<=100)
		{
						
			if(imarks >=75)
			{
				System.out.println("Distinction");
			}
			else
			{
				System.err.println("Pass");
			}
		
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

}
