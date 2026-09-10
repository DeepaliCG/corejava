package While_Loop_Example;

public class Ass4_Q8_Sum_Of_Odd_Numbers {

	public static void main(String[] args) {


		int i = 1;
		int isum=0;
		while(i<=100)
		{
			if(i%2!=0)
			{
				isum=isum+i;
				System.out.println(isum);
			}
			i++;
		}

	}

}
