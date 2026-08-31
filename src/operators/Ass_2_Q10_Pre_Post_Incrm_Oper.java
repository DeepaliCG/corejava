package operators;

import java.util.Scanner;

public class Ass_2_Q10_Pre_Post_Incrm_Oper {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a = sc.nextInt();
		
		System.out.println("Pre Increment : "+(++a));
		System.out.println("Post Increment : "+(a++));
		
		System.out.println("Post Increment : 2nd time : "+(a));
	}

}
