package Array;

import java.util.Arrays;

public class Q3_Compare_Two_Array {

	public static void main(String[] args) {


		int[] iarr_1 = {10,20,30};
		int[] iarr_2 = {10,20,30,40};
		
		if(Arrays.equals(iarr_1, iarr_2))
		{
			System.out.println("Both arrays are identical");
		}
		else
		{
			System.out.println("Both arrays are not identical");
		}

	}

}
