package Multilevel_Vehicle_Car_ElectricCar;

import java.util.Scanner;

public class Main_Vehicle {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Brand Name ");
		String sbrand = sc.next();
		
		System.out.println("Enter Max Speed");
		int imaxspeed = sc.nextInt();
		
		System.out.println("How many doors that car has?");
		int idoors = sc.nextInt();
		
		System.out.println("Enter Battery Capacity");
		int icap = sc.nextInt();
		
		System.out.println("How many hours are required for charging?");
		int ihrs = sc.nextInt();
		
		ElectricCar obj_ElectricCar = new ElectricCar();
		obj_ElectricCar.showBasicInfo(sbrand, imaxspeed);
		obj_ElectricCar.showCarDetails(idoors);
		obj_ElectricCar.charge(icap, ihrs);
		
		sc.close();

	}

}
