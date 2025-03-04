package com.nit.stream_api.day8;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;
// min age
record Employee(Integer age,String name)
{
	
}
public class MinDemo2 {
	public static void main(String[] args) {
		Employee e1 = new Employee(23, "Scott");
		Employee e2 = new Employee(27, "Alen");
		Employee e3 = new Employee(24, "Martin");
		Employee e4 = new Employee(18, "Mike");
		
		Stream<Employee> stream = Stream.of(e1,e2,e3,e4);
		Optional<Employee> min = stream.min(Comparator.comparingInt(Employee::age));
		min.ifPresent(System.out::println);
	
	}
}
