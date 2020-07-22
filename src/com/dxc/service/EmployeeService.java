package com.dxc.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.dxc.model.Employee;

public class EmployeeService {

	List<Employee>emplist=new ArrayList<Employee>();
	
	public boolean register (Employee emp,Scanner sc,int noOfEmp) {
		 boolean result =false;
		 
		 for(int i=0; i< noOfEmp;i++) {
			 System.out.println("Enter employee id:");
			 emp.setEmpid(Integer.parseInt(sc.nextLine()));
			 System.out.println("Enter employee name:");
			 emp.setEmpname(sc.nextLine());
			 System.out.println("Enter the emp salary");
			 emp.setSalary(Double.parseDouble(sc.nextLine()));
			 emplist.add(emp);
			 
			}
		 if(emplist.size()!=0) {
			 System.out.println("Number of employee is"+emplist.size());
			 result =true;
		 }
		 return result;
		 
	}
		
	
         public void display() {
        	 Iterator<Employee> iterator=emplist.iterator();
        	 while(iterator.hasNext()) {
        		 System.out.println(iterator.next()); 
        		 Employee emp = iterator.next();
        	 }
         }
}
