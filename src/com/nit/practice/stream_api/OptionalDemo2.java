package com.nit.practice.stream_api;

import java.util.Optional;

class Employees
{
	private Integer employeeId;
	private String employeeName;
	
	public Employees() 
	{
		super();		
	}

	public Employees(Integer employeeId, String employeeName) 
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

	public static void main(String[] args) 
	{
		//Employee emp1 = new Employee();
		Employees emp1 = new Employees(111,"Scott");
		
		
		//Approach 1
		Optional<Integer> employeeId = emp1.getEmployeeId();
		
		if(employeeId.isPresent())
		{
			System.out.println("Id is :"+employeeId.get());
		}
		else
		{
			System.err.println("employeeid is not available");
		}
		
		//Approach2
		  Optional<String> employeeName = emp1.getEmployeeName();
		  String empName = employeeName.orElse("employee name is not available");
          System.out.println("Name is :"+empName);
          
         
          
	}

}