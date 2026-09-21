package Constructor_Example;

public class Book {


	String title;
	String author;
	int price;
	
	//constructor
	Book()
	{
		title = "2 States";
		author = "Chetan Bhagat";
		price = 100;
	}
	
	//creating method to display variable
		void display()
		{
		System.out.println("Title : "+title+" Author : "+author+" Price : "+price);
	
		}
	
	
	public static void main(String[] args) {

		//creating an object of constructor
		Book obj_Book = new Book();
		obj_Book.display();
		

	}

}
