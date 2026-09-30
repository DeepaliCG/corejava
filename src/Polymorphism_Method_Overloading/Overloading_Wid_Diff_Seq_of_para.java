package Polymorphism_Method_Overloading;

public class Overloading_Wid_Diff_Seq_of_para {

	void display(int a,String name)
	{
		System.out.println("Happy "+a+"th Birthday "+name);
	}
	
	void display(String name,int a)
	{
		System.out.println("Wishing the happiest "+a+"th Birthday "+name);
	}
	
	public static void main(String[] args) {


		Overloading_Wid_Diff_Seq_of_para obj = new Overloading_Wid_Diff_Seq_of_para();
		obj.display(8, "Malhar");
		obj.display("Malhar", 8);

	}

}
