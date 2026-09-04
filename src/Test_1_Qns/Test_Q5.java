package Test_1_Qns;

import java.util.Scanner;

public class Test_Q5 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Value of a : ");
		int a = sc.nextInt();
		
		System.out.println("Enter Value of b : ");
		int b= sc.nextInt();
		
		System.out.println("++a - --b + a-- - b++ : "+(++a - --b + a-- - b++));
		
		System.out.println("value of a : "+a+" value of b : "+b);

	}

}
