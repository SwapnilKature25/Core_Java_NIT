package com.nit.stream.Operation84;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class EmployeeOperations {
	private static final String RED = "\033[1;31m"; // RED
	private static final String RESET = "\033[0m"; // Text Reset
	public static void main(String[] args)
	{
		List<Employee> list = EmployeeAdder.addDetails();
		
//		 1. Filter Employees by Gender:
//		 - Retrieve a list of all female employees.
		System.out.println(RED+"*****Retrieve a list of all female employees********"+RESET);
		
		list.stream()
			.filter(gen -> gen.getGender()
			.equalsIgnoreCase("female"))
			.forEach(System.out::println);
		
		System.out.println();
		
//		2. Filter Employees by Age:
//			   - Get a list of employees older than 30 years.
		System.out.println(RED+"*****Get a list of employees older than 30 years.********"+RESET);
		list.stream()
			.filter(age -> age.getAge()>30)
			.forEach(System.out::println);
		
		System.out.println();
		
//		3. Filter Employees by Salary:
//			   - Find employees with a salary greater than $50,000.
		System.out.println(RED+"*****Find employees with a salary greater than $50,000.********"+RESET);
		list.stream()
			.filter(sal -> sal.getSalary() > 50000)
			.forEach(System.out::println);
			
		System.out.println();
		
		
//		4. Map Employee Names:
//		   - Create a list of employee names (Strings).
		System.out.println(RED+"*************Create a list of employee names (Strings)*************"+RESET);
		list.stream()
			.map(Employee::getName)
			.forEach(System.out::println);
			 
		System.out.println();
		

//		5. Calculate Average Salary:
//			   - Calculate the average salary of all employees.
		System.out.println(RED+"*********Calculate the average salary of all employees.*******"+RESET);
		OptionalDouble average = list.stream()
			.mapToDouble(Employee::getSalary)
			.average();
		average.ifPresent(System.out::println);
			
		System.out.println();
		
		double orElseThrow = list.stream()
				.mapToDouble(Employee::getSalary)
				.average()
				.orElseThrow();
			System.out.println("The average salary is  : "+orElseThrow);
		
		
		System.out.println();


//		6. Find Maximum Salary:
//			   - Find the employee with the highest salary.
		System.out.println(RED+"*********Find the employee with the highest salary.********"+RESET);
		double orElseThrow2 = list.stream()
			.mapToDouble(Employee::getSalary)
			.max()
			.orElseThrow();
		System.out.println("The highest emp salary is : "+orElseThrow2);
			
		
		System.out.println();
		

//		7.Group Employees by Gender:
//			   - Group employees by gender and return
//			   a map with gender as the key and a list of employees as the value.
		System.out.println(RED+"******Group employees by gender and return a map******"+RESET);
		list.stream()
			.collect(Collectors.groupingBy(Employee::getGender))
			.forEach( (k,v) -> System.out.println(k+" - "+v));
		
		System.out.println();


//		8. Count Male Employees:
//			   - Count the number of male employees.
		System.out.println(RED+"**********Count the number of male employees.*********"+RESET);
		long count = list.stream()
			.filter(emp -> emp.getGender().equalsIgnoreCase("Male"))
			.count();
		System.out.println("total male employees are : "+count);
		
		System.out.println();
		

//		9. Sum of All Salaries:
//			   - Calculate the total sum of salaries for all employees.
		System.out.println(RED+"*********Calculate the total sum of salaries for all employees.**********"+RESET);
		double sum = list.stream()
			.mapToDouble(Employee::getSalary)
			.sum();
		System.out.println("Sum of All salaries : "+sum);
		
		
		System.out.println();
		

//		10. Sort Employees by Name:
//		    - Sort the employees by their names in alphabetical order.
		System.out.println(RED+"*******Sort the employees by their names in alphabetical order.*****"+RESET);
		list.stream()
			.sorted( (p1,p2) -> p1.getName().compareTo(p2.getName()))
			.forEach(System.out::println);

		System.out.println();
		
		list.stream().sorted(Comparator.comparing(Employee::getName))
		.forEach(System.out::println);
		
		System.out.println();
		
		

//		11. Sort Employees by Age:
//		    - Sort the employees by age in ascending order.
		System.out.println(RED+"**********Sort the employees by age in ascending order.********"+RESET);
		list.stream()
			.sorted(Comparator.comparingInt(Employee::getAge))
			.forEach(System.out::println);
				
		
		System.out.println();
		

//		12. Sort Employees by Salary:
//		    - Sort the employees by salary in descending order.
		System.out.println(RED+"*********Sort the employees by salary in descending order.******"+RESET);
		list.stream()
			.sorted(Comparator.comparingDouble(Employee::getSalary).reversed() )
			.forEach(System.out::println);
		
		
		System.out.println();
		

//		13. Find Oldest Employee:
//		    - Find the oldest employee.
		System.out.println(RED+"*********Find the oldest employee.*********"+RESET);
		list.stream()
			.sorted(Comparator.comparing(Employee::getAge).reversed())
			.limit(1)
			.forEach(System.out::println);
		
		System.out.println();

		// 2
		int orElseThrow3 = list.stream()
			.mapToInt(Employee::getAge)
			.max()
			.orElseThrow();
		System.out.println("Max Age : "+orElseThrow3);
		
		// 3
		Employee employee = list.stream()
			.max((s1,s2)-> s1.getAge()-s2.getAge()) 
//			.get();  throw error if list is empty
			.orElseThrow();
		System.out.println(employee);
		
		System.out.println();
		
		

//		14. Group Employees by Age:
//		    - Group employees into age groups (e.g., 20-30, 31-40, etc.)
//		    and return a map with age group as the key and a list of employees as the value.
		System.out.println(RED+"****Group employees into age groups (e.g., 20-30, 31-40, etc.)*****"+RESET);
		Map<String, List<Employee>> collect = list.stream()
			.collect(Collectors.groupingBy((t) -> {
					int age=(int)t.getAge();
					if(age >= 20 && age <= 30 )
						return "20-30";
					if(age >= 31 && age <= 40 )
						return "31-40";
					else
						return "40+";
			}));
		collect.forEach( (k,v) -> System.out.println((k+" - "+v)));
			
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
}
