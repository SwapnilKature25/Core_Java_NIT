package com.nit.practice.stream_api.intermediate;

import java.util.List;
import java.util.stream.Collectors;

// //Fetch all the Employees name whose salary is greater than 50k 

record Employee(Integer id,String names,Double salary)
{
	
}
public class StreamDemo1 {
	public static void main(String[] args) {
		 Employee e1 = new Employee(111, "Juber", 90000D); 
		   Employee e2 = new Employee(222, "Aryan", 40000D); 
		   Employee e3 = new Employee(333, "Scott", 60000D); 
		   Employee e4 = new Employee(444, "Rahul", 70000D); 
		   Employee e5 = new Employee(555, "Aakash",85000D); 
		   Employee e6 = new Employee(666, "Manav", 92000D); 
		   
		  //1 
		List<Employee> emp = List.of(e1,e2,e3,e4,e5,e6);
		
		List<String> collect = emp.stream().filter(s -> s.salary() > 50000)
		.map(str -> str.names()).collect(Collectors.toList());
		
		//2
		List<Employee> sort = List.of(e1,e2,e3,e4,e5,e6)
				.stream().filter(s -> s.salary() > 50000)
				.collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		sort.forEach(System.out::println);
		
		//add 500D in the salary for all the Employees
		List<Double> updated = emp.stream().map(sal -> sal.salary()+500).collect(Collectors.toList());
		updated.forEach(System.out::println);
	}
}
