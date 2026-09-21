package Constructor_Example;

public class Book_Para_Cons {
	
	String stitle;
	String sauthor;
	int iprice;
	
	Book_Para_Cons(String title,String author,int price)
	{
		stitle = title;
		sauthor = author;
		iprice = price;
	}
	
	void displayDetails()
	{
		System.out.println("Title : "+stitle+" Author : "+sauthor+" Price : "+iprice);
	}

	public static void main(String[] args) {


		//creating an object
		Book_Para_Cons obj_Book = new Book_Para_Cons("2States","Chetan Bhagat",100);
		obj_Book.displayDetails();

	}

}
