package For_Loop_Example;

public class Ass4_Q8_Sum_Of_Odd_No {

	public static void main(String[] args) {


		int isum=0;
		
		for(int i=1;i<=100;i++)
		{
			if (i%2==0)
			{
				isum = isum+i;
				System.out.println(isum);
			}
		}

	}

}
