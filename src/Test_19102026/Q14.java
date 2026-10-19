package Test_19102026;

public class Q14 {

	public static void main(String[] args) {


		String str1 = "Java Programming";
		
		//find length
		System.out.println("Length : "+str1.length());
		
		//convert to upper case
		System.out.println("Upper case : "+str1.toUpperCase());
		
		//convert to lower case
		System.out.println("Lower case : "+str1.toLowerCase());
		
		//contains A-- starts with A
		System.out.println("Original String : "+str1);
		
		if(str1.contains("A")==true)
		{
			System.out.println("String contains A");
		}
		else
		{
			System.out.println("String does not contains A");
		}

	}

}
