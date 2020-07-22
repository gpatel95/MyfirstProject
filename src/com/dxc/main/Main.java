package com.dxc.main;

import java.util.Scanner;

import com.dxc.model.Employee;
import com.dxc.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();
		EmployeeService service=new EmployeeService();
		System.out.println("Enter the no of employee to register");
		int noOfEmp=Integer.parseInt(sc.nextLine());
		boolean result=service.register(emp,sc,noOfEmp);
		if(result) {
			service.display();
			System.out.println("Employee registered successfully");
		}
		else
			System.out.println("Employee is not registered");
		

		
		

	}

}
