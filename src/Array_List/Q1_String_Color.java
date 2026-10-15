package Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class Q1_String_Color {

	public static void main(String[] args) {

		//creating an array of String values
		ArrayList<String> arr_color = new ArrayList<>();
		
		//adding values
		arr_color.add("Red");
		arr_color.add("Blue");
		arr_color.add("Green");
		arr_color.add("Yellow");
		
		//1.retrieving value @index 2
		System.out.println("Value at index 2 is " + arr_color.get(2));
		
		//2.inserting value @2nd position
		arr_color.add(1,"Purple");
		System.out.println("Adding Purple to array list : "+arr_color);
		
		//3.removing Green from array list
		arr_color.remove("Green"); 
		System.out.println("Removing Green from array list : "+arr_color);
		
		//4.printing array
		System.out.println("Printing Array List : "+arr_color);
		
		//5.sorting elements in alphabetical order
		Collections.sort(arr_color);
		System.out.println("Sorting in alphabetical order : "+arr_color);
		 
		//6.reverse the array list
		Collections.reverse(arr_color);
		System.out.println("Reversing an array list : "+arr_color);
		
		//7.Iterating array using for each loop
		for(String val : arr_color)
		{
			System.out.println("Inside For Loop : "+val);
		}

	}

}
