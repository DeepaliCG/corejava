package IfElseStatement;

import java.util.Scanner;

public class Ass3_Q5_Largest_no {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter First Value");
int a = sc.nextInt();

System.out.println("Enter Second Value");
int b = sc.nextInt();

if (a>b)
{
	System.out.println(a+" is greater");
}
else 
{
	System.out.println(b+" is greater");
}
	}

}
