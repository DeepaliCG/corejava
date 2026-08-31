package operators;

import java.util.Scanner;

public class Ass2_Q10_Pre_Post_Incrmnt_Decrmnt {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Value of a : ");
		int a = sc.nextInt();
		
		System.out.println("Enter Value of b : ");
		int b = sc.nextInt();
		
		System.out.println(++a - --b + a-- - b++);

	}

}
