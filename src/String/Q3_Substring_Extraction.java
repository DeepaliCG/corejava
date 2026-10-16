package String;

public class Q3_Substring_Extraction {

	public static void main(String[] args) {

		String str="Java Programming";
		String str1 = "Hello, World!";
		
		//printing original string
		System.out.println("Original String : "+str);
		
		//extracting from index5 to end
		System.out.println("Extracting from index 5 to end : "+str.substring(5));
		
		//printing original string
		System.out.println("Original String : "+str1);
		
		//extracting from 0 to 4
		System.out.println("Extracting from index 0 to 4 : "+str1.substring(0, 4));
		

	}

}
