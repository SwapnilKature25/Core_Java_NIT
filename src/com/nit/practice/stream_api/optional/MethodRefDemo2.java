package com.nit.practice.stream_api.optional;

@FunctionalInterface
interface Workers
{
	void work();
}

public class MethodRefDemo2 
{
	public static void main(String[] args)
	{
	  Workers w2= () -> System.out.println("Workers are getting salary");
	  w2.work();
	
	  Workers w1 = Employe::salary;
	  w1.work();

	}

}


class Employe
{
	public static void salary()
	{
		System.out.println("Employee is Working for Salary");
	}
}