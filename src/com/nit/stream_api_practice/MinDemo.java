package com.nit.stream_api_practice;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

//Finding the minimum age of Employee

record Employee4(Integer age, String name)
{
	
}


public class MinDemo
{
	public static void main(String[] args)
	{		
		Employee4 e1 = new Employee4(23, "Scott");
		Employee4 e2 = new Employee4(29, "Smith");
		Employee4 e3 = new Employee4(21, "John");
		Employee4 e4 = new Employee4(18, "Martin");
		
		
		
		
		Stream<Employee4> streamOfEmployee = Stream.of(e1,e2,e3,e4);
		
		Optional<Employee4> min = streamOfEmployee.min(Comparator.comparingInt(Employee4::age));
		min.ifPresent(System.out::println);
	}

}