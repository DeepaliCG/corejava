package String;

public class Q10_Split_String {

	public static void main(String[] args) {
		
		String str = "I am learning Java programming";
		
		System.out.println("Original String : "+str);
		
		//splitting string 
		String str_arr[] = str.trim().split(" ");
		System.out.println("Splitting String");
		for(String val : str_arr)
		{
			System.out.println(val);
		}

	}

}
