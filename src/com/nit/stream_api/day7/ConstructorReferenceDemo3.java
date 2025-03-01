package com.nit.stream_api.day7;

import java.util.function.Function;

class Employee
{
	private String eName;

	public Employee(String eName) {
		super();
		this.eName = eName;
	}

	public String geteName() {
		return eName;
	}
	
	
}

public class ConstructorReferenceDemo3 {
	public static void main(String[] args) {
		Function<String,Employee> fn1 = Employee::new;
		Employee emp = fn1.apply("Alen");
		System.out.println(emp.geteName()); // Alen
	}
}
