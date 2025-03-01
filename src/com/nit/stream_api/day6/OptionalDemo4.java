package com.nit.stream_api.day6;

import java.util.Optional;

class Employee
{
	private Integer empId;
	private String empName;
	
	
	public Employee()
	{
		
	}


	public Employee(Integer empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	public Optional<Integer> getEmpId()
	{
		return Optional.ofNullable(empId);
	}
	
	public Optional<String> getEmpName()
	{
		return  Optional.ofNullable(empName);
	}
	
	
}

public class OptionalDemo4 {
	public static void main(String[] args) {
//		Employee emp=new Employee();
		Employee emp=new Employee(null, null);
//		
		Optional<Integer> empId = emp.getEmpId();	
		Integer id = empId.orElse(000);
		
		Optional<String> empName = emp.getEmpName();
		String name = empName.orElse("Name is not Present");
		
		System.out.println("Employee Id : "+id);
		System.out.println("Employee Name : "+name);
//		System.out.println("Employee Id : "+emp.getEmpId());
//		System.out.println("Employee Name : "+emp.getEmpName());
		
	}
}
