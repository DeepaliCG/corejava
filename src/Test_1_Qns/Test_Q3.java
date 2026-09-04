package Test_1_Qns;

import java.util.Scanner;

public class Test_Q3 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name ");
		String sname = sc.next();
		
		System.out.println("Enter Course Name ");
		String scourse = sc.next();
		
		System.out.println("Enter Your Age ");
		int iage = sc.nextInt();
		
		System.out.println("My name is "+sname+". My course name is "+scourse+" and my age is "+iage);
	}

}
