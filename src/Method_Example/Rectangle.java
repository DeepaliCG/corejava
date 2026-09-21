package Method_Example;

import java.util.Scanner;

public class Rectangle {

	//static method
	static void calculateArea(int para1,int para2)
	{
		System.out.println(para1*para2);
		
	}
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of Length");
		int ilen = sc.nextInt();
		
		System.out.println("Enter the Value of Width");
		int iwid =  sc.nextInt();
		
		//calling static method
		calculateArea(ilen,iwid);

	}

}
