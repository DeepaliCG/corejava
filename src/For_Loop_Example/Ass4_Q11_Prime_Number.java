package For_Loop_Example;

import java.util.Scanner;

public class Ass4_Q11_Prime_Number {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int inum = sc.nextInt();
		
		int icnt = 0;
		
		for(int i =1;i<=inum;i++)
		{
			if(inum%i==0)
			{
				icnt++;
			}
		}
		if(icnt==2)
		{
			System.out.println(inum+" is Prime Number");
		}
		else
		{
			System.out.println(inum+" is not a Prime Number");
		}

	}

}
