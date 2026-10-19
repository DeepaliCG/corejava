package Test_19102026;

//package Array_List;

import java.util.ArrayList;

public class Q13 {

	public static void main(String[] args) {


		ArrayList<Integer> iarr = new ArrayList<>();
		
		//add elements
		iarr.add(89);
		iarr.add(78);
		iarr.add(56);
		iarr.add(45);
		iarr.add(199);
		
		
		System.out.println("element"+iarr);
		
		//1.retrieving ele @index4
		System.out.println("Element @index4 : "+iarr.get(4));
		
		//2.insert 200 @index3
		iarr.add(3, 200);
		System.out.println("Inserting 200 @index3 : "+iarr);
		
		//3.removing 78
		iarr.remove(Integer.valueOf(78));
		System.out.println("Removing 78 : "+iarr);
		
		//4.iterating 
		for (int val : iarr)
		{
			System.out.println("Inside For : "+val);
			
		}
		
		//5.print whole array list
		System.out.println("Printing whole array List :"+iarr);

	}

}
