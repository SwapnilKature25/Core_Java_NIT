package com.nit.stream.Operation84;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class Tester {
	private static final String RED = "\033[1;31m"; // RED
	private static final String RESET = "\033[0m"; // Text Reset
	public static void main(String[] args)
	{
		List<Employee> list = EmployeeAdder.addDetails();
		Set<Integer> set = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		
		System.out.println(RED+"*****Retrieve a list of all female employees********"+RESET);
//		1. Filter Employees by Gender:
			// - Retrieve a list of all female employees.
		list.stream()
			.filter(gen -> gen.getGender()
			.equalsIgnoreCase("female"))
			.forEach(System.out::println);
	
		System.out.println();

		System.out.println(RED+"*****Get a list of employees older than 30 years.********"+RESET);
//		2. Filter Employees by Age:
		list.stream()
			.filter(e -> e.getAge() > 30)
			.forEach(System.out::println);
		
		System.out.println();
		
		System.out.println(RED+"*****Find employees with a salary greater than $50,000.********"+RESET);
//		3. Filter Employees by Salary:
//			   - Find employees with a salary greater than $50,000.
		list.stream()
			.filter(sal -> sal.getSalary() > 50000)
			.forEach(System.out::println);
	
		System.out.println();

//		4. Map Employee Names:
//			   - Create a list of employee names (Strings).
		System.out.println(RED+"*************Create a list of employee names (Strings)*************"+RESET);
		list.stream()
			.map(str -> str.getName())
			.forEach(System.out::println);
		
		System.out.println();


//		5. Calculate Average Salary:
//			   - Calculate the average salary of all employees.
		System.out.println(RED+"*********Calculate the average salary of all employees.*******"+RESET);
		double orElseThrow = list.stream()
			.mapToDouble(Employee::getSalary)
			.average()
			.orElseThrow();
		System.out.println("The average salary is  : "+orElseThrow);
		
		System.out.println();

//		6. Find Maximum Salary:
//		   - Find the employee with the highest salary.
		System.out.println(RED+"*********Find the employee with the highest salary.********"+RESET);
		double orElseThrow2 = list.stream()
			.mapToDouble(Employee::getSalary)
			.max()
			.orElseThrow();
		System.out.println("Max salary : "+orElseThrow2);
		
		
//		7.Group Employees by Gender:
//		   - Group employees by gender and return
//		   a map with gender as the key and a list of employees as the value.
		System.out.println(RED+"******Group employees by gender and return a map******"+RESET);
		list.stream()
			.collect(Collectors.groupingBy(Employee::getGender))
			.forEach( (k,v) -> System.out.println(k+" - "+v));
			
		System.out.println();
		
//		8. Count Male Employees:
//		   - Count the number of male employees.
		System.out.println(RED+"**********Count the number of male employees.*********"+RESET);
		long count = list.stream()
			.filter(gen -> gen.getGender().equalsIgnoreCase("male"))
			.count();
		System.out.println("Total Male Employees : "+count);
			
		System.out.println();

//		9. Sum of All Salaries:
//		   - Calculate the total sum of salaries for all employees.
		System.out.println(RED+"*********Calculate the total sum of salaries for all employees.**********"+RESET);
		double sum = list.stream()
			.mapToDouble(Employee::getSalary)
			.sum();
		System.out.println("Sum of all salaries : "+sum);
		
		System.out.println();

//		10. Sort Employees by Name:
//		    - Sort the employees by their names in alphabetical order.
		System.out.println(RED+"*******Sort the employees by their names in alphabetical order.*****"+RESET);
		list.stream()
			.sorted(Comparator.comparing(Employee::getName))
			.forEach(System.out::println);
		
		System.out.println();

//		11. Sort Employees by Age:
//		    - Sort the employees by age in ascending order.
		System.out.println(RED+"**********Sort the employees by age in ascending order.********"+RESET);
		list.stream()
			.sorted(Comparator.comparing(Employee::getAge))
			.forEach(System.out::println);
		
		System.out.println();

//		12. Sort Employees by Salary:
//		    - Sort the employees by salary in descending order.
		System.out.println(RED+"*********Sort the employees by salary in descending order.******"+RESET);
		list.stream()
			.sorted(Comparator.comparing(Employee::getSalary))
			.forEach(System.out::println);
				
		System.out.println();
		
//		13. Find Oldest Employee:
//	    - Find the oldest employee.
		System.out.println(RED+"*********Find the oldest employee.*********"+RESET);
		System.out.print("Oldest Employee : ");
		// 1
		list.stream()
			.sorted(Comparator.comparing(Employee::getAge, Comparator.reverseOrder()))
			.limit(1)
			.forEach(System.out::println);
		
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
//	    - Group employees into age groups (e.g., 20-30, 31-40, etc.)
//	    and return a map with age group as the key and a list of employees as the value.
		System.out.println(RED+"****Group employees into age groups (e.g., 20-30, 31-40, etc.)*****"+RESET);
		
		list.stream()
			.collect(Collectors.groupingBy( (t)->
											{
												int age=t.getAge();
												if(age>=20 && age<=30)
													return "20-30";
												else if(age>=31 && age<=40)
													return "31-40";
												else
													return "40+";
											})).forEach( (k,v) -> System.out.println(k+" - "+v));	
		System.out.println();
		
//		15. Find Employees with a Specific Age:
//	    - Find all employees who are exactly 35 years old.
		System.out.println(RED+"************ Find all employees who are exactly 35 years old.***********"+RESET);
		list.stream()
			.filter(age -> age.getAge()==35)
			.forEach(System.out::println);
		
		System.out.println();

//		16. Calculate the Sum of Salaries by Gender:
//	    - Calculate the sum of salaries for each gender (i.e., male and female)
//	    and return a map with gender as the key and the sum of salaries as the value.
		System.out.println(RED+"********* Calculate the sum of salaries for each gender**********"+RESET);
		list.stream()
			.collect(Collectors.groupingBy
					(Employee::getGender, Collectors.summingDouble(Employee::getSalary)))
			.forEach( (k,v) -> System.out.println(k+" - "+v));
		
		System.out.println();

//		17. Find Employees with Names Starting with "J":
//	    - Find all employees whose names start with the letter "E."
		System.out.println(RED+"*********Find all employees whose names start with the letter J******"+RESET);
		list.stream()
			.filter(names -> names.getName().startsWith("E"))
			.forEach(System.out::println);
		
		System.out.println();

//		18. Calculate the Average Salary for Male and Female Employees:
//	    - Calculate the average salary separately for male
//	    and female employees and return a map with gender
//	    		as the key and the average salary as the value.
		list.stream()
			.collect(Collectors.groupingBy
					(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)))
			.forEach((k,v) -> System.out.println(k+" - "+v));
		System.out.println();
		
		// count no. of employees gender wise 
		System.out.println(RED+"*********count no. of employees gender wise*********"+RESET);
		list.stream()
			.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
			.forEach( (k,v) -> System.out.println(k+" - "+v));
		
		System.out.println();

//		19. Find the Top N Highest Paid Employees:
//	    - Find the top N employees with the highest salaries.

		System.out.println(RED+"*******Find the top N employees with the highest salaries.********"+RESET);
		list.stream()
			.sorted((s1,s2) -> (int)(s2.getSalary() - s1.getSalary()))  // 
			.limit(3)
			.forEach(System.out::println);
		System.out.println();
		
		list.stream()
		.sorted((s1,s2) -> Double.compare(s2.getSalary(), s1.getSalary()))  // 
		.limit(3)
		.forEach(System.out::println);
		
		System.out.println();
		list.stream()
			.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
			.limit(3)
			.forEach(System.out::println);
	
		System.out.println();
		

//		20. Retrieve Distinct Age Values:
//		    - Get a list of distinct ages of all employees.
		System.out.println(RED+"*********Get a list of distinct ages of all employees.*********"+RESET);

		list.stream()
			.map(Employee::getAge)
			.distinct()
			.forEach(System.out::println);
		System.out.println();
		list.stream().filter(k->!set.add(k.getAge())).forEach(System.out::println);
		
		System.out.println();
		
//		21. Find the Three Lowest-Paid Employees:
//		   - Find and display the names of the three employees with the lowest salaries.
		System.out.println(RED+"*******Find and display the names of the three employees with the lowest salaries.********"+RESET);
		list.stream()
			.sorted(Comparator.comparingDouble(Employee::getSalary))
			.limit(3)
			.forEach(System.out::println);
		
		System.out.println();

		
//		22. Sort Employees by Name Length:
//		   - Sort employees by the length of their names (shortest to longest).
		System.out.println(RED+"***********Sort employees by the length of their names (shortest to longest).*******"+RESET);
		list.stream()
			.sorted((s1,s2) -> (s1.getName().length() - s2.getName().length() ))
			.map(Employee::getName)
			.forEach(System.out::println);
			
		System.out.println();
		
//		23. Group Employees by Age Range:
//		   - Group employees into custom
//		   age ranges (e.g., 20-29, 30-39, etc.) and
//		   return a map with the age range as the key and a list of employees as the value.
		System.out.println(RED+"*********Group employees into custom age ranges (e.g., 20-29, 30-39, etc.)*********"+RESET);
		Map<String, List<Employee>> collect = list.stream()
			.collect(Collectors.groupingBy((t)->
														{
														int age=t.getAge();
														if(age >= 20 && age <= 29)
															return "20-29";
														else if(age>=30 && age<=39)
															return "30-39";
														else
															return "40+";
														}
												));
		collect.forEach( (k,v) -> System.out.println(k+" - "+v));
	
		System.out.println();

//		24. Find the Average Salary of Employees Aged 30 or Younger:
//		   - Calculate the average salary of employees aged 30 or younger.

		System.out.println(RED+"********Calculate the average salary of employees aged 30 or younger.******"+RESET);
		double orElseThrow4 = list.stream()
			.filter(age -> age.getAge() <=30)
			.mapToDouble( k -> k.getSalary())
			.average().orElseThrow();
		System.out.println(orElseThrow4);
		
		System.out.println();
		
//		25. Find the Names of Male Employees with Salaries Over $60,000:
//		   - Retrieve the names of male employees with salaries over $60,000.
		System.out.println(RED+"**********Retrieve the names of male employees with salaries over $53,000.***********"+RESET);
		list.stream()
			.filter(sal -> sal.getSalary() > 50000)
			.map(Employee::getName)
			.forEach(System.out::println);
		
		System.out.println();

//		26. Find the Youngest Female Employee:
//			   - Find the youngest female employee.
		System.out.println(RED+"**********Find the youngest female employee.**********"+RESET);
		list.stream()
			.filter( emp -> emp.getGender().equalsIgnoreCase("female"))
			.sorted(Comparator.comparing(Employee::getAge))
			.limit(1)
			.forEach(System.out::println);
	
		System.out.println();
		
		Employee employee2 = list.stream()
				.filter(k->k.getGender().equals("Female"))
				.collect(Collectors.minBy((o1, o2) -> o1.getAge()-o2.getAge())).get();
				System.out.println(employee2);
		
		
		System.out.println();
		
//		27. Retrieve the Names of Employees in Reverse Order:
//		   - Get a list of employee names in reverse order (from the last employee to the first).
		System.out.println(RED+"******Get a list of employee names in reverse order*******"+RESET);
		
//		list.stream()
//			.sorted(Comparator.comparing(Employee::getName).reversed())
//			.map(Employee::getName)
//			.forEach(System.out::println);
		
		List<String> collect2 = list.stream()
			.map(k -> k.getName())
			.collect(Collectors.toList());
		
		Collections.reverse(collect2);
		System.out.println(collect2);
		System.out.println();
			


//		28. Find the Highest Salary Among Female Employees:
//			   - Find the highest salary among female employees.
		System.out.println(RED+"******Find the highest salary among female employees."+RESET);
		// 1
		list.stream()
			.filter(emp -> emp.getGender().equalsIgnoreCase("female"))
			.sorted(Comparator.comparing(Employee::getSalary).reversed())
			.limit(3)
			.forEach(System.out::println);
			
		System.out.println();
		// 2
		Employee employee3 = list.stream()
				.filter(k->k.getGender().equals("Female"))
				.collect(Collectors.maxBy( (s1,s2) -> (int)(s1.getSalary() - s2.getSalary()))).get();
		System.out.println(employee3);
		
		System.out.println();
		

//		29. Group Employees by Age and Gender:
//			   - Group employees by both age and gender and return a multi-level map.
		System.out.println(RED+"********Group employees by both age and gender and return a multi-level map.*****"+RESET);
		Map<String, Map<Integer, List<Employee>>> collect3 = list.stream()
			.collect(Collectors.groupingBy(Employee::getGender,Collectors.groupingBy(Employee::getAge)));
		
		collect3.forEach( (key,value) ->
		{
			value.forEach( (k,v) -> System.out.println(k+" - "+v));
			System.out.println(key+" - "+value);
		});
		
		System.out.println();

		

//		30. Find the Sum of Salaries for Employees with Names Containing "Smith":
//			   - Calculate the sum of salaries for employees whose names contain the substring "Smith."
		System.out.println(RED+"******* Calculate the sum of salaries for employees whose names contain the substring Smith***"+RESET);
		// 1
		Double collect4 = list.stream()
			.filter(names -> names.getName().equalsIgnoreCase("Smith"))
			.collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println(collect4);
	
		// 2  	
		double sum2 = list.stream()
			.filter(k -> k.getName().contains("Employee"))
			.mapToDouble(s -> s.getSalary()).sum();
		System.out.println(sum2);
		
		System.out.println();
		
//		31. Find the Names of Employees Aged 30-40 with Salaries Between $50,000 and $60,000:
//		   - Retrieve the names of employees aged 30-40 with salaries between $50,000 and $60,000.
		System.out.println(RED+"******Retrieve the names of employees aged 30-40 with salaries between $50,000 and $60,000.*******"+RESET);
		list.stream()
			.filter(age -> (age.getAge() >=30 && age.getAge()<=40) && (age.getSalary()>=50000 && age.getSalary()<=60000))
			.forEach(System.out::println);
		
		System.out.println();
		
		

//		32. Calculate the Total Number of Employees:
//			   - Determine the total count of employees.
		System.out.println(RED+"******** Determine the total count of employees.*******"+RESET);
		System.out.println("Total Count of employess : "+list.stream().count());
		
		System.out.println();


//		33. Find the Most Common Age Among Employees:
//			   - Determine the age that is most common among the employees.
		System.out.println(RED+"******Determine the age that is most common among the employees.***"+RESET);
//		list.stream()
//			.filter( (s1,s2)-> s1.g)
		
		
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
