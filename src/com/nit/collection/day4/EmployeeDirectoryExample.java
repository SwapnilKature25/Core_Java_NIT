package com.nit.collection.day4;

import java.util.ArrayList;

public class EmployeeDirectoryExample {
	public static void main(String[] args) {
		Directory directory=new Directory();
		Employee emp1=new Employee("Alice","SE",120000);
		Employee emp2=new Employee("Bob","QE",100000);
		Employee emp3=new Employee("Omkr","JE",200000);
		
		directory.addEmployee(emp1);
		directory.addEmployee(emp2);
		directory.addEmployee(emp3);
		
		directory.displayAllEmployees();
		System.out.println();
		directory.updateEmployee(1);
		directory.displayAllEmployees();
		System.out.println();
		directory.deleteEmployee(0);
		directory.displayAllEmployees();
		
	
		
	}	
}
