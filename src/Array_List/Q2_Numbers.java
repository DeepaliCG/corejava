package Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class Q2_Numbers {

	public static void main(String[] args) {

		//CREATING AN ARRAY
		ArrayList<Integer> arr_int = new ArrayList<>();
		
		//Adding values
		arr_int.add(89);
		arr_int.add(78);
		arr_int.add(56);
		arr_int.add(45);
		arr_int.add(199);
		
		System.out.println(arr_int);
		
		//1.retrieving element @index 4
		System.out.println("Element @index 4 is "+arr_int.get(4));
		
		//2.inserting 200 at third position
		arr_int.add(2,200);
		System.out.println("Adding 200 at third position : "+arr_int);
		
		//3.removing 78
		arr_int.remove(Integer.valueOf(78));
		System.out.println("Removing 78 : "+arr_int);
		
		//4.iterate using for loop
		for (int val : arr_int)
		{
			System.out.println("Inside for loop : "+val);
		}
		
		//5.printing array list
		System.out.println("Printing whole array list : "+arr_int);
		
		//6.sorting array
		Collections.sort(arr_int);
		System.out.println("Sorting array list : "+arr_int);
		
		//7.reverse array list
		Collections.reverse(arr_int);
		System.out.println("Reverse array list : "+arr_int);

	}

}
