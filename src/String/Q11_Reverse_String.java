package String;

public class Q11_Reverse_String {

	public static void main(String[] args) {


		String str = "Java";
		String new_str = "";
		
		System.out.println("Original String : "+str);
		
		//reversing--starting from last index to first index
		for (int i = str.length()-1 ; i>=0 ; i--)
		{
			new_str = new_str+str.charAt(i);
		}
		
		System.out.println("Reversed String : "+new_str);
	}

}
