package Hierarchical_Employee_Developer_Manager;

import java.util.Scanner;

public class Main_Employee {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID");
		int eid = sc.nextInt();
		
		System.out.println("Enter Employee Name");
		String sname = sc.next();
		
		System.out.println("Enter Base Salary");
		int ibasesal = sc.nextInt();
		
		System.out.println("Enter Programming Language");
		String splang = sc.next();
		
		System.out.println("Enter TEm Size");
		int iteam = sc.nextInt();
		
		Developer obj_Developer = new Developer();
		obj_Developer.displayDetails(eid, sname, ibasesal);
		obj_Developer.writeCode(splang);
		
		Manager obj_Manager = new Manager();
		obj_Manager.displayDetails(eid, sname, ibasesal);
		obj_Manager.conductMeeting(iteam);
		
		sc.close();

	}

}
