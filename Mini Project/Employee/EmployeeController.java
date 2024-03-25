package com.qsp.employee;

import java.util.Scanner;

public class EmployeeController {
	int i;
	Employee[] arr = new Employee[5];
	Scanner sc = new Scanner(System.in);

	public void saveData() {
		System.out.println("<--- Hello Enter your details here --->");
		System.out.print("Enter Employee ID: ");
		int id = sc.nextInt();
		System.out.print("Enter Employee NAME: ");
		String name = sc.next();
		System.out.print("Enter Employee MOBNO: ");
		long mobno = sc.nextLong();

		Employee e1 = new Employee(id, name, mobno);
		arr[i++] = e1;
		System.out.println("Data entered successfully. \n");
	}

	public void printData(int id) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				if (arr[i].id == id) {
					System.out.println("Details of employee ID no: " + id);
					System.out.println(arr[i].id);
					System.out.println(arr[i].name);
					System.out.println(arr[i].mobno);
				} else
					System.out.println("Sorry, Employee ID not found!!");
			}
		}
	}

	public void updateData(int id) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				if (arr[i].id == id) {
						System.out.println(
								"Which one to update? \n 1. Update Name \n 2. Update Mobno \n");
						System.out.print("Enter your choice: ");
						int choice = sc.nextInt();
						switch (choice) {
						case 1: {
							System.out.print("Enter updated name: ");
							String name = sc.next();
							arr[i].name = name;
							System.out.println("Name updated successfully. \n");
						}
							break;
						case 2: {
							System.out.print("Enter updated mobno: ");
							long mobno = sc.nextLong();
							arr[i].mobno = mobno;
							System.out.println("Mobno updated successfully. \n");
						}
							break;
						}
				} else
					System.out.println("Sorry, Employee ID not found!!");
			}
		}
	}
}
