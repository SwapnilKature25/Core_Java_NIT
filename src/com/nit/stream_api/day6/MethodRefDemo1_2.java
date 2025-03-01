package com.nit.stream_api.day6;

@FunctionalInterface
interface Worke
{
	void work();
}

class Employe
{
	public static void salary()
	{
		System.out.println("Emp is working for salary...");
	}
}

public class MethodRefDemo1_2 {
	public static void main(String[] args) {
		Worke w2= Employe::salary;
		w2.work();
		
//		Employe e=Employe::salary;  // The target type of this expression must be a functional interface
	}
}
