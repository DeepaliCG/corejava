package Test_2;

import java.util.Scanner;

public class Book {
	
	String title;
	String author;
	int price;
	
	//creating parameterized constructor
	Book(String stitle,String sauthor,int iprice)
	{
		title = stitle;
		author = sauthor;
		price = iprice;
	}

	//method for displaying info
	void displayDetails ()
	{
		System.out.println("Title : "+title+" Author : "+author+" Price : "+price);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Title");
		String st = sc.next();
		
		System.out.println("Enter Author Name ");
		String sa = sc.next();
		
		System.out.println("Enter The Price Amount");
		int ip = sc.nextInt();
		
		//creating an object
		Book obj_Book = new Book(st,sa,ip);
		obj_Book.displayDetails();
		
	}

}
