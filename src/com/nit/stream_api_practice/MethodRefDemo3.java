package com.nit.stream_api_practice;


@FunctionalInterface
interface Workeer
{
	void work(double salary);
}

public class MethodRefDemo3
{
	public static void main(String[] args)
	{
	   Workeer w1 = new Employees()::salary;
	   w1.work(55000);

	}
}

class Employees
{
	public void salary(double salary)
	{
		System.out.println("Employee Salary is :"+salary);
	}
}