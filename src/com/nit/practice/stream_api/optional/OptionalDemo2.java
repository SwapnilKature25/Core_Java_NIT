package com.nit.practice.stream_api.optional;

import java.util.Optional;

// //Writing different style of setter and getter

class Employee
{
	private Integer employeeId;
	private String employeeName;
	
	public Employee() 
	{
		super();		
	}

	public Employee(Integer employeeId, String employeeName) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	
	public Optional<Integer> getEmployeeId()
	{
		return Optional.ofNullable(employeeId);
	}
	
	
	public Optional<String> getEmployeeName()
	{
		return Optional.ofNullable(employeeName);
	}
	
}
public class OptionalDemo2 {

	public static void main(String[] args) {
		Employee emp1= new Employee(111, "Scott");
		Optional<Integer> employeeId = emp1.getEmployeeId();
		if(employeeId.isPresent())
		{
			System.out.println("Employee Id : "+employeeId.get());
		}
		else 
		{
			System.out.println("Employee Id not available ");			
		}
		
		Optional<String> employeeName = emp1.getEmployeeName();
		String name = employeeName.orElse("Emp Name is not available....");
		System.out.println("Name is :"+name);
	}

}
