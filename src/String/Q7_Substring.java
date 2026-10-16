package String;

public class Q7_Substring {

	public static void main(String[] args) {

		String str = "Java Programming";
		String str1 = "Hello, World!";
		
		//original string
		System.out.println("Original String : "+str);
		
		//System.out.println("contains Pro?"+str.contains("Pro"));
		
		if (str.contains("Pro") == true)
		{
			System.out.println("Contains Pro");
		}
		else
		{
			System.out.println("Does not contain Pro");
		}
		
		if(str1.contains("world"))
		{
			System.out.println("Contains world");
		}
		else
		{
			System.out.println("Does not contain world");
		}
	}

}
