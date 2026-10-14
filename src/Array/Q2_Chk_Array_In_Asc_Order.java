package Array;

public class Q2_Chk_Array_In_Asc_Order {

	public static void main(String[] args) {
		
		int[] iarr = {4,6,7,8};
		boolean order_flag = true;
		
		for(int i =0 ;i<iarr.length-1 ; i++)
		{
			//comparing element with next element.if previous is greater then array is not sorted hence setting flag value false
			if(iarr[i] > iarr[i+1])
					{
						order_flag = false;
						break;
					}
					
		}
		
		if(order_flag == true)
		{
			System.out.println("Array is in Ascending order");
		}
		else
		{
			System.out.println("Array is not in Ascending order");
		}
	}

}
