package com.qsp.employee;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeController e = new EmployeeController();
		while(true) {
		System.out.println("<---------------------------------->");
		System.out.println("Choose your option \n 1. Save Data \n 2. Print Data by ID \n 3. Update Data by ID \n 4. Exit");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:{
			e.saveData();
		}break;
		case 2:{
			System.out.print("Enter Employee ID to print: ");
			int id = sc.nextInt();
			e.printData(id);
		}break;
		case 3:{
			System.out.print("Enter Employee ID for Updation: ");
			int id = sc.nextInt();
			e.updateData(id);
		}break;
		case 4:
			System.exit(0);
		}
		
		}
		}
}
