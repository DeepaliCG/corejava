package String;

public class Q5_Character_at_index {

	public static void main(String[] args) {

		String str = "Java is fun!";
		
		//printing original string
		System.out.println("Original String : "+str);
		
		//getting char at index 5
		System.out.println("Char at index 5 : "+str.charAt(5));
		
		//char at last index
		System.out.println("Char at last index: "+str.charAt(str.length()-1));
	}

}
