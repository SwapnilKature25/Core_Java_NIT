package com.nit.exception;

class Employee extends Object
{
	private int employeeId;
	private String employeeName;
	
	public Employee(int employeeId, String employeeName) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}	
	
	
	
}

public class EqualsDemo 
{
	public static void main(String[] args)
	{
	   Employee e1 = new Employee(111, "Scott"); //1000x	
	   Employee e2 = new Employee(111, "Scott"); //2000x	
	  
	   
	   System.out.println(e1==e2); //false
	   System.out.println(e1.equals(e2)); //false [== operator]

	}

}