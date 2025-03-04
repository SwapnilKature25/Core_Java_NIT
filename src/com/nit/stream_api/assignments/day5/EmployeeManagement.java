package com.nit.stream_api.assignments.day5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class EmployeeManagement {
	private static List<Employee> employees = new ArrayList<>();
	
	private static void addEmployee(Employee emp)
	{
		employees.add(emp);
		System.out.println("Employee added Successfully...");
	}
	
	private static void updateEmployee(Employee emp,int index)
	{
		if(employees.contains(index))
		{
			employees.add(emp);
			System.out.println("Employee Updated Successfully...");
		}
		else {
			System.err.println("Employee Not Found");
		}
	}
	
	private static void removeEmployee(int index)
	{
		if(employees.contains(index))
		{
			employees.remove(index);
		}
		else {
			System.out.println("Employee not found");
		}
	}
	private static void listAllEmployee()
	{
		employees.forEach(System.out::println);
	}
	
	private static void sortEmployeesByName()
	{
		List<Employee> sorted = employees.stream()
		.sorted( (n1,n2)-> n1.getName().compareTo(n2.getName())).toList();
		sorted.forEach(System.out::println);
	}
	
	private static void findHighestSalarByDepartment()
	{
		Map<String, Employee> collect = employees
				.stream()
				.collect(Collectors.toMap(Employee::getDepartment,e->e,(e1,e2)->e1.getSalary()>e2.getSalary()?e1:e2));
		collect.entrySet().forEach(System.out::println);
		
	}
	
	private static void categorizeAndIncreaseSalary()
	{
//		Map<String, Employee> collect = employees
//				.stream()
//				.collect(Collectors.toMap(Employee::getDepartment, e -> e, (e1,e2)->e1.getSalary()>e2.getSalary()?e1:e2));
		
//employees.stream().collect(Collectors.groupingBy(Employee::getGender)).collectCollectors.groupingBy(Employee::getDepartment)));

		Map<String, Map<String, Optional<Employee>>> collect = employees.stream()
		.collect(Collectors.groupingBy(Employee::getGender,
				Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))));
		
		collect.entrySet().forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			while(true)
			{
				System.out.println("========Choose an Operation : ========= ");
				System.out.println("\n\t1. Add Employee"+
									"\n\t2. Update Employee"+
									"\n\t3. Remove Employee"+
									"\n\t4. List All Employees"+
									"\n\t5. Sort Employees By Name"+
									"\n\t6. Find Highest salary by department"+
									"\n\t7. Categorize and Increase Salary"+
									"\n\t8. Exit"					
									);
				
				System.out.print("Enter your Choice : ");
				int ch = Integer.parseInt(sc.nextLine());
				
				switch(ch)
				{
					case 1:
						System.out.println("Enter Name ");
						String name=sc.nextLine();
						System.out.println("Enter Gender ");
						String gen=sc.nextLine();
						System.out.println("Enter Department ");
						String dept=sc.nextLine();
						System.out.println("Enter salary ");
						Double sal =Double.parseDouble(sc.nextLine());
						System.out.println("Enter years of experience:");
						int yoe=Integer.parseInt(sc.nextLine());
					
						if(sal <0 ) {
							System.err.println("Salary must be a numeric value");
						}
						else if(yoe < 0)
						{
							System.err.println("Years of experience cannot be negative.");
						}
						else {
							addEmployee(new Employee(name,gen,dept,sal,yoe));
				
						}
						break;
						
					case 2:
						System.out.println("Enter index of employee to update:");
						int index =Integer.parseInt(sc.nextLine());
//						
//						if(employees.size() <=index)
//						{
							System.out.println("Enter new Name ");
							String nName=sc.nextLine();
							System.out.println("Enter new Gender ");
							String nGen=sc.nextLine();
							System.out.println("Enter new Department ");
							String nDept=sc.nextLine();
							System.out.println("Enter new salary ");
							Double nSal =Double.parseDouble(sc.nextLine());
							System.out.println("Enter new years of experience:");
							int nYoe=Integer.parseInt(sc.nextLine());
						
							if(nSal <0 ) {
								System.err.println("Salary must be a numeric value");
							}
							else if(nYoe < 0)
							{
								System.err.println("Years of experience cannot be negative.");
							}
							else {
								updateEmployee(new Employee(nName,nGen,nDept,nSal,nYoe),index);
							}
//						}
//						else {
//							System.out.println("Employee not found.");
//						}
						
						
						break;
						
					case 3:
						System.out.println("Enter index of employee to remove:");
						int indx =Integer.parseInt(sc.nextLine());
						
						removeEmployee(indx);						
						break;
						
					case 4:
						listAllEmployee();
						break;
						
					case 5:
						sortEmployeesByName();
						break;
						
					case 6:
						findHighestSalarByDepartment();
						break;
						
					case 7:
						categorizeAndIncreaseSalary();
						break;
						
					case 8:
						System.out.println("Exiting...");						
						System.exit(0);
						break;
					default:
						System.out.println("enter valid choice");
						
				}
			
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
}
