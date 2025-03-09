package com.nit.practice.stream_api.optional;

@FunctionalInterface
interface Worker2
{
	void work(double salary);
}

public class MethodRefDemo3
{
	public static void main(String[] args)
	{
	   Worker2 w1 = new Employee2()::salary;
	   w1.work(35000);

	}
}

class Employee2
{
	public void salary(double salary)
	{
		System.out.println("Employee Salary is :"+salary);
	}
}
