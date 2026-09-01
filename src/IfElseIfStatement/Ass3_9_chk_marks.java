package IfElseIfStatement;

import java.util.Scanner;

public class Ass3_9_chk_marks {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks");
		int a = sc.nextInt();
		
		if(a>=90 && a<=100)
		{
			System.out.println("A+");
		}
		else if(a>=80)
		{
			System.out.println("A");
		}
		else if (a>=70)
		{
			System.out.println("B");
		}
		else if (a>=60)
		{
			System.out.println("C");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
