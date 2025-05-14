package com.nit.stream_api_practice;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

//Finding the Employee with the Highest Salary

record Employee5(Integer employeeId, String employeeName, Double employeeSalary)
{	
}

public class MaxDemo
{
	public static void main(String[] args)
	{
		Employee5 e1 = new Employee5(111, "Aman", 23000D);
		Employee5 e2 = new Employee5(222, "Ramesh", 24000D);
		Employee5 e3 = new Employee5(333, "Suraj", 25000D);
		Employee5 e4 = new Employee5(444, "Raj", 26000D);
		Employee5 e5 = new Employee5(555, "Scott", 46000D);
		
		Stream<Employee5> streamOfEmployees = Stream.of(e1,e2,e3,e4,e5);
		
		Optional<Employee5> max = streamOfEmployees.max(Comparator.comparingDouble(Employee5::employeeSalary));
		max.ifPresent(System.out::println);
	}
}