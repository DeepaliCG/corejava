package String;

public class Q4_Concatination {

	public static void main(String[] args) {

		String str1 = "John";
		String str2 = "Doe";
		String str3 = "Hello";
		
		//printing original values
		System.out.println("String1 : "+str1+" String2 : "+str2);
		
		//concatinating both strings
		System.out.println("Concatination : "+str1.concat(" "+str2));

		//concatinating str3 and string 1
		System.out.println("Concate : "+str3.concat(" "+str1));
	}

}
