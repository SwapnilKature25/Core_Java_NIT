package com.nit.collection.set;

import java.util.Arrays;

record Employeees(Integer id, String name) implements Comparable<Employeees>
{

	@Override
	public int compareTo(Employeees e2) 
	{
		return this.id - e2.id;
	}	
		
}

public class ComparableUsingArray 
{
	public static void main(String[] args) 
	{					       
		Employeees []employees = new Employeees[3];
        
        employees[0] = new Employeees(333, "Zuber");
        employees[1] = new Employeees(222, "Aryan");
        employees[2] = new Employeees(111, "Raj");       
     
        System.out.println("Original Data :");
        
        for(Employeees emp : employees)
        {
        	System.out.println(emp);
        }
      
        System.out.println("Sorted Data Based On the ID:");
        
        Arrays.sort(employees);
        
        for(Employeees emp : employees)
        {
        	System.out.println(emp);
        }
        
	}
}