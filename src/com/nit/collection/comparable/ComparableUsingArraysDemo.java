package com.nit.collection.comparable;

import java.util.Arrays;

record Employee(Integer id, String name) implements Comparable<Employee>
{

	@Override
	public int compareTo(Employee e2) 
	{
		return this.id - e2.id;
	}	
		
}

public class ComparableUsingArraysDemo 
{
	public static void main(String[] args) 
	{					       
        Employee []employees = new Employee[3];
        
        employees[0] = new Employee(333, "Zuber");
        employees[1] = new Employee(222, "Aryan");
        employees[2] = new Employee(111, "Raj");       
     
        System.out.println("Original Data :");
        
        for(Employee emp : employees)
        {
        	System.out.println(emp);
        }
      
        System.out.println("Sorted Data Based On the ID:");
        
        Arrays.sort(employees);
        
        for(Employee emp : employees)
        {
        	System.out.println(emp);
        }
        
	}
}