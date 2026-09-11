package DoWhile_Loop_Example;

public class Ass4_Q9_Sum_Of_Even_Numbers {

	public static void main(String[] args) {


		int i =1;
		int isum=0;
		do
		{
			if(i%2==0)
			{
				isum = isum+i;
				System.out.println(isum);
			}
			i++;
		}
		while(i<=100);

	}

}
