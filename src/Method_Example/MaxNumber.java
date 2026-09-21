package Method_Example;

import java.util.Scanner;

public class MaxNumber {
	
	//non static method
	void findMax(int para1,int para2,int para3)
	{
		if(para1>para2 && para1>para3)
		{
			System.out.println("Largest value : "+para1);
		}
		else if(para2>para1 && para2>para3)
		{
			System.out.println("Largest value : "+para2);
		}
		else
		{
			System.out.println("Largest value : "+para3);
		}
	}

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Value");
		int a = sc.nextInt();
		
		System.out.println("Enter 2nd Value");
		int b = sc.nextInt();
		
		System.out.println("Enter 3rd Value");
		int c = sc.nextInt();
		
		//calling non static method
		MaxNumber obj = new MaxNumber();
		obj.findMax(a,b,c);

	}

}
