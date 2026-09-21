package Method_Example;

public class counter {

	//static variable
	static int staticCount=0;
	//non static variable
	int nonStaticCount = 0;
	
	static void incrementStatic()
	{
		System.out.println("Value of Static Variable : "+(++staticCount));
	}
	
	void incrementNonStatic()
	{
		System.out.println("Value of Non Static Variable : "+(++nonStaticCount));
	}
	
}
