package Array;

public class Q4_Print_Length_Of_Array {

	public static void main(String[] args) {


		int[] iarr = {10,20,30,40};
		int ilen = iarr.length;
		
		System.out.println("Array : ");
		for(int ival : iarr)
		{
			System.out.print(ival+" ");
		}
		System.out.println("\nLength of an array is "+ilen);

	}

}
