package String;

public class Q9_Check_Equality {

	public static void main(String[] args) {

		String str4 = "Hello";
		String str5 = "hello";
		
		System.out.println("STrin4 : "+str4+" String5: "+str5);
		
		//checking str4 = str5 -- case sensetive
		System.out.println("case sensetive:str4=str5: "+str4.equals(str5));
		
		//checking str4 = str5 -- ignore case sensetive
		System.out.println("Ignore case sensetive : "+str4.equalsIgnoreCase(str5));

	}

}
