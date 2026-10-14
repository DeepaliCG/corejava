package Array;

public class Q7_swap_two_elements {

	public static void main(String[] args) {


		
		int temp =0;
		int[] iarr = {10,20,30,40};
		int ilen = iarr.length;
		
		
		System.out.println("Array values before swap ");
		
		for(int val : iarr)
		{
			System.out.print(val+ " ");
		}
		
		temp = iarr[0];
		iarr[0] = iarr[ilen-1];
		iarr[ilen-1] = temp;
		
		System.out.println("\nArray values after swap");
		for(int val : iarr)
		{
			System.out.print(val+" ");
		}
		

	}

}
