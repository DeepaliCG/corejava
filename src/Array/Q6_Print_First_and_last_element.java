package Array;

public class Q6_Print_First_and_last_element {

	public static void main(String[] args) {


		int[] iarr = {10,20,30,40};
		int first_val = iarr[0];
		int last_val = iarr[iarr.length-1];
		
		System.out.println("Array Values");
		for(int val :  iarr)
		{
			System.out.print(val+" ");
		}
		System.out.println("\nFirst Element : "+first_val);
		System.out.println("Last Element : "+last_val);

	}

}
