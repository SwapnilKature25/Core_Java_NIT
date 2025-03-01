package com.nit.stream_api.day6;


@FunctionalInterface
interface Worker3
{
	void work(double salary);
}

class Employe2
{
	public static void salary(double sal)
	{
		System.out.println("Emp salary is "+sal);
	}
}

public class MethodRefDemo1_3 {

	public static void main(String[] args) {
		Worker3 w3=Employe2::salary;
		w3.work(6786.7);  //Emp salary is 6786.7

	}

}
