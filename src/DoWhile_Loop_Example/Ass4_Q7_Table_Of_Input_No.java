package DoWhile_Loop_Example;

import java.util.Scanner;

public class Ass4_Q7_Table_Of_Input_No {

	public static void main(String[] args) {


		int i =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number ");
		int a = sc.nextInt();
		do
		{
			System.out.println(a*i);
			i++;
		}
		while(i<=10);

	}

}
