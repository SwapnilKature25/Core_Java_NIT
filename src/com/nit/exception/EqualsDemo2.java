package com.nit.exception;

import java.util.Objects;

class Employees extends Object
{
	private int employeeId;
	private String employeeName;
	
	public Employees(int employeeId, String employeeName) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName);
	}

	//Overriding equals(Object obj) method for content	comparison
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		return employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName);
	}

	
	
	
	
}

public class EqualsDemo2
{
	public static void main(String[] args)
	{
	   Employees e1 = new Employees(111, "Scott");	
	   Employees e2 = new Employees(111, "Scott");	
	   
	  
	   System.out.println(e1.equals(e2));  //true

	}

}