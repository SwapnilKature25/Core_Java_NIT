package com.nit.stream_api.assignments.day2;

import java.util.Arrays;
import java.util.List;

record Employee(String name,String id,Double salary)
{
	
}
public class EmployeeSorting {
	public static void main(String[] args) {
		List<Employee> emp=Arrays.asList(
				new Employee("Alex","A121",56000d),
				new Employee("Martin","A142",20000d),
				new Employee("Scott","A132",40000d),			
				new Employee("Mike","A122",30000d)				
				);
//		map(e -> e.salary() > 30000)
		emp.stream()
		.filter((e -> e.salary() > 30000))
		.map(e -> e.name())
		.forEach(System.out::println);
		
		
	}
}
