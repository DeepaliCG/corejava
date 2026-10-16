package String;

public class Q6_Replace_char {

	public static void main(String[] args) {

		String str3 = "apple";
		String str = "I like apple pie!";
		
		//original string
		System.out.println("Original String : "+str3);
		
		System.out.println("Replace a with o : "+str3.replace("a", "o"));
		
		
		//original string
		System.out.println("Original String : "+str);
		
		//replace apple with orange
		System.out.println("Replace apple with orange : "+str.replace("apple", "orange"));

	}

}
