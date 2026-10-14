package Array;

public class Q5_Copy_array_to_other_array {

	public static void main(String[] args) {


		int[] iarr_source = {10,20,30,40};
		int[] iarr_dest = new int[iarr_source.length];
		
		for(int i=0 ; i<iarr_source.length ; i++)
		{
			iarr_dest[i] = iarr_source[i];
		}
		
		System.out.println("Source array");
		for(int val_source : iarr_source)
		{
			System.out.print(val_source+" ");
		}
		
		System.out.println("\nDestination array");
		for(int val_dest : iarr_dest)
		{
			System.out.print(val_dest+" ");
		}

	}

}
