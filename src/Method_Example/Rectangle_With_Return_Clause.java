package Method_Example;

import java.util.Scanner;

public class Rectangle_With_Return_Clause {

	public static int calculateArea(int len,int wid)
	{
			System.out.println("Length : "+len+" width : "+wid);
			int area = len*wid;
			return area;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		int ilen = sc.nextInt();
		System.out.println("Enter Width");
		int iwid = sc.nextInt();
		
		System.out.println("Area of Rectangle : "+calculateArea(ilen,iwid));

	}

}
