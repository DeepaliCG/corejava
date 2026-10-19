package Test_19102026;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 1 to 5");
		int a=sc.nextInt();
		
		switch(a)
		{
		case 1: System.out.println("Very Bad"); break;
		case 2: System.out.println("Bad"); break;
		case 3: System.out.println("Average"); break;
		case 4: System.out.println("Good"); break;
		case 5: System.out.println("Excellent"); break;
		default : System.out.println("Invalid number entered");
		}

	}

}
