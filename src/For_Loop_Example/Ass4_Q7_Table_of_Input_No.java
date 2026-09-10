package For_Loop_Example;

import java.util.Scanner;

public class Ass4_Q7_Table_of_Input_No {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value ");
		int a = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(a*i);
		}

	}

}
