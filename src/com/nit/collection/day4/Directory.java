package com.nit.collection.day4;

import java.util.ArrayList;
import java.util.Vector;

public class Directory {
	ArrayList<Employee> directory=new ArrayList<>();
	public void addEmployee(Employee emp)
	{
		directory.add(emp);
	}
	
	public void displayAllEmployees()
	{
		for (Employee employee : directory) {
//			System.out.println("Employee Name : "+employee.getName() +"\tEmployee Position : "+employee.getPosition()+"\tEmployee Salary :"+employee.getSalary());
			System.out.println(employee.toString());
		}
	}
	
	public void updateEmployee(int index)
	{
		Employee employee = directory.get(index);
		
		employee.setPosition("Senior Developer");
		employee.setSalary(55000);
	}
	
//	public void deleteEmployee(Employee emp)
//	{
//			if(directory.contains(emp))
//			{
//				System.out.println(emp.getName()+" is deleted from the directory.");
//				directory.remove(emp);
//			}
//	}
	public void deleteEmployee(int index)
	{
		Employee emp=directory.remove(index);
		System.out.println(emp.getName()+" is deleted from the directory.");
	}
	
	
}
