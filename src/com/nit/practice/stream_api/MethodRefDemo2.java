package com.nit.practice.stream_api;

@FunctionalInterface
interface Worker2
{
	void work();
}

public class MethodRefDemo2 
{
	public static void main(String[] args)
	{
	  Worker2 w1 = Employee2::salary;
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