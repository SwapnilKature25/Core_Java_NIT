package com.nit.stream_api.day6;

@FunctionalInterface
interface Worker
{
	void work();
}

class Employees
{
	public void work()
	{
		System.out.println("Employee is working..");
	}
}

public class MethodRefDemo1 {
	public static void main(String[] args) {
		
		//Lambda Expression
		Worker w1 = () -> System.out.println("Worker is working");
		w1.work();
//		Worker is working
		
		//Method Reference
		Worker w2 = new Employees()::work;
		w2.work();
//		Employee is working..
		
		
	}
}


