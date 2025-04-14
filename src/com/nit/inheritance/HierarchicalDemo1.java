package com.nit.inheritance;
class Employee
{
	protected double salary;
	public Employee(double salary) 
	{
		super();
		this.salary = salary;
	}
}
class Developer extends Employee
{
	public Developer(double salary) 
	{
		super(salary);
	}

	@Override
	public String toString() 
	{
		return "Developer [salary=" + salary + "]";
	}
	
	
}

class Designer extends Employee
{
	public Designer(double salary) 
	{
		super(salary);
	}

	@Override
	public String toString() {
		return "Designer [salary=" + salary + "]";
	}	
}
public class HierarchicalDemo1 {

	public static void main(String[] args)
	{
		Developer developer = new Developer(45000);
		System.out.println(developer);
		
		Designer designer = new Designer(20000);
		System.out.println(designer);
		

	}

}