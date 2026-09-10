package While_Loop_Example;

public class Ass4_Q9_Sum_Of_Even_Numbers {

	public static void main(String[] args) {


		int isum=0;
		int i=1;
		while(i<=100)
		{
			if(i%2==0)
			{
				isum = isum+i;
				System.out.println(isum);
			}
			i++;
		}

	}

}
