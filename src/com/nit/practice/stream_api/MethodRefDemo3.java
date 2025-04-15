package com.nit.practice.stream_api;

@FunctionalInterface
interface Worker3
{
	void work(double salary);
}

public class MethodRefDemo3
{
	public static void main(String[] args)
	{
	   Worker3 w1 = new Employee3()::salary;
	   w1.work(55000);

	}
}

class Employee3
{
	public void salary(double salary)
	{
		System.out.println("Employee Salary is :"+salary);
	}
}
