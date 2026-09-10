package While_Loop_Example;

import java.util.Scanner;

public class Ass4_Q7_Table_Of_Number {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value ");
		int a = sc.nextInt();
		int i =1;
		while(i<=10)
		{
			System.out.println(a*i);
			i++;
		}

	}

}
