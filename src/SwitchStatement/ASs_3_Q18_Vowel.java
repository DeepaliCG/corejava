package SwitchStatement;

import java.util.Scanner;

public class ASs_3_Q18_Vowel {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Letter");
		char inpval = sc.next().charAt(0);
		

		switch(inpval)
		{
		case 'a':System.out.println(inpval+" is vowel");break;	
		case 'e':System.out.println(inpval+" is vowel");break;
		case 'i':System.out.println(inpval+" is vowel");break;
		case 'o':System.out.println(inpval+" is vowel");break;
		case 'u':System.out.println(inpval+" is vowel");break;
		case 'A':System.out.println(inpval+" is vowel");break;	
		case 'E':System.out.println(inpval+" is vowel");break;
		case 'I':System.out.println(inpval+" is vowel");break;
		case 'O':System.out.println(inpval+" is vowel");break;
		case 'U':System.out.println(inpval+" is vowel");break;
		
		default:System.out.println(inpval+" is consonant");
		}
		
	}

}
