package Array;

public class Q8_print_even_odd_no {

	public static void main(String[] args) {


		int[] iarr = {1,2,3,4};
		int[] iarr_even = new int[iarr.length];
		int even_counter = 0;
		int[] iarr_odd = new int[iarr.length];
		int odd_counter = 0;
		
		System.out.println("Array values ");
		for(int val: iarr)
		{
			System.out.print(val+" ");
		}
		
		for(int i=0 ; i< iarr.length ; i++)
		{
			if(iarr[i]%2==0)
			{
				iarr_even[even_counter]=iarr[i];
				even_counter = even_counter+1;
			}
			else
			{
				iarr_odd[odd_counter]=iarr[i];
				odd_counter = odd_counter+1;
			}
		}
		
		System.out.println("\nEven no.s are ");
		for(int val_even : iarr_even)
		{
			System.out.print(val_even+" ");
		}
		
		System.out.println("\n Odd no.s are");
		for(int val_odd : iarr_odd)
		{
			System.out.print(val_odd+" ");
		}

	}

}
