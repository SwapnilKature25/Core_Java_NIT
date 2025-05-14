package com.nit.stream_api_practice;

@FunctionalInterface
interface Worker
{
	void work();
}

public class MethodRefDemo1 
{
	public static void main(String[] args)
	{
	   //Lambda Expression
		Worker w1 = () -> System.out.println("Worker is working");
		w1.work();
		
		//Method Reference 
		Worker w2 = new Employeee()::work;
		w2.work();

	}

}

class Employeee 
{
	public void work()
	{
		System.out.println("Employee is Working");
	}
}