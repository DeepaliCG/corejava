package Constructor_Example;

public class Car_THIS_Keyword {

	String make ;
	String model;
	int year;
	
	Car_THIS_Keyword(String make,String model,int year)
	{
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	void displayCarInfo()
	{
		System.out.println("This car model "+model+" is made by "+make+" in the year of "+year);
	}
	
	public static void main(String[] args) {


		Car_THIS_Keyword obj_Car_THIS_Keyword = new Car_THIS_Keyword("TATA","NEXON",2023); 
		obj_Car_THIS_Keyword.displayCarInfo();

	}

}
