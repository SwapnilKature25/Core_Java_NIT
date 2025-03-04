package com.nit.stream_api.assignments.day5;

public class Employee {
	private String name;
	private String gender;
	private String department;
	private double salary;
	private int years_Of_Exp;
	
	public Employee()
	{
		
	}
	
	public Employee(String name, String gender, String department, double salary, int years_Of_Exp) {
		super();
		this.name = name;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
		this.years_Of_Exp = years_Of_Exp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getYears_Of_Exp() {
		return years_Of_Exp;
	}

	public void setYears_Of_Exp(int years_Of_Exp) {
		this.years_Of_Exp = years_Of_Exp;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", department=" + department + ", salary=" + salary
				+ ", years_Of_Exp=" + years_Of_Exp + "]";
	}
	
	
	
}
