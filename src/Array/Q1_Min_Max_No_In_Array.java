package Array;

public class Q1_Min_Max_No_In_Array {

	public static void main(String[] args) {


		int[] iarr = {60,30,5,80,1};
		int min_val = iarr[0];//iarr[0] = 60
		int max_val = iarr[0];//iarr[0] = 60
		
		for(int i=0 ; i<iarr.length ; i++)
		{
			if(iarr[i] < min_val)
			{
				min_val = iarr[i];
			}
			
			if(iarr[i] > max_val)
			{
				max_val = iarr[i];
			}
		}
		
		for(int val : iarr)
		{
			System.out.print(val+" ");
		}
		
		System.out.println("\nMax value of an array is "+max_val);
		System.out.println("Min value of an array is "+min_val);

	}

}
