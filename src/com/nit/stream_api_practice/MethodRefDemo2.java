package com.nit.stream_api_practice;

@FunctionalInterface
interface Workers
{
	void work();
}

public class MethodRefDemo2 
{
	public static void main(String[] args)
	{
	  Workers w1 = Employee2::salary;
	  w1.work();

	}

}


class Employee2
{
	public static void salary()
	{
		System.out.println("Employee is Working for Salary");
	}
}