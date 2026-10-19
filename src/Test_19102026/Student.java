package Test_19102026;

public class Student {

	String name;
	int rollNo;
	int marks;
	
	Student(String sname,int irollno,int imarks)
	{
		name = sname;
		rollNo = irollno;
		marks = imarks;
		
	}
	
	void displayStudent()
	{
		System.out.println("NAme : "+name+" ROLLNO : "+rollNo+" marks : "+marks);
	}
	
	public static void main(String[] args) {

		Student obj =new Student("Deepali",10,100);
		obj.displayStudent();

	}

}
