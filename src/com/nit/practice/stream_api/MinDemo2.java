package com.nit.practice.stream_api;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

//Finding the minimum age of Employee

record Employeee(Integer age, String name)
{
	
}


public class MinDemo2 
{
	public static void main(String[] args)
	{		
		Employeee e1 = new Employeee(23, "Scott");
		Employeee e2 = new Employeee(29, "Smith");
		Employeee e3 = new Employeee(21, "John");
		Employeee e4 = new Employeee(18, "Martin");
		
		
		
		
		Stream<Employeee> streamOfEmployee = Stream.of(e1,e2,e3,e4);
		
		Optional<Employeee> min = streamOfEmployee.min(Comparator.comparingInt(Employeee::age));
		
		
		
		min.ifPresent(System.out::println);
	}

}