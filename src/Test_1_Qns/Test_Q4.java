package Test_1_Qns;

import java.util.Scanner;

public class Test_Q4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Value");
		int ival = sc.nextInt();
		
		int num = 20;
		System.out.println(" Num Value : "+num);
		
		System.out.println("val+=num : "+(ival+=num)+" val-=num : "+(ival-=num)
				+" val*=num : "+ (ival*=num)+" val/=num : "+ (ival/=num)
				+" val%=num : "+(ival%=num));

	}

}
