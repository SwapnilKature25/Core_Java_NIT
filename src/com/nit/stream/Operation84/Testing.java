package com.nit.stream.Operation84;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Testing {
	private static final String RED = "\033[1;31m"; // RED
	private static final String RESET = "\033[0m"; // Text Reset
	public static void main(String[] args) {
		List<Employee> list = EmployeeAdder.addDetails();
		Set<Integer> s1=new HashSet<>();
		
//		 1. Filter Employees by Gender:
//		 - Retrieve a list of all female employees.
		System.out.println(RED+"*****Retrieve a list of all female employees********"+RESET);
			list.stream()
				.filter(emp -> emp.getGender().equalsIgnoreCase("female"))
				.forEach(System.out::println);
			
		System.out.println(RED+"*****Get a list of employees older than 30 years.********"+RESET);
//		2. Filter Employees by Age:
//				   - Get a list of employees older than 30 years.
			list.stream()
				.filter( emp -> emp.getAge() > 30)
				.forEach(System.out::println);

	}
}	 	
