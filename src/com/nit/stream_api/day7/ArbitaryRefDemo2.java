package com.nit.stream_api.day7;

import java.util.Arrays;

class Person2
{
	String name;

	public Person2(String name) {
		super();
		this.name = name;
	}
	
	public int personInstanceMethod1(Person2 p2)
	{
		return this.name.compareTo(p2.name);
	}

	@Override
	public String toString() {
		return "Person2 [name=" + name + "]";
	}
	
}

public class ArbitaryRefDemo2 {
	public static void main(String[] args) {
		Person2[] personArray = {
				new Person2("Zuber"),
				new Person2("Raj"),
				new Person2("Ankit"),				
				new Person2("Rohit"),				
		};
		
		Arrays.sort(personArray, Person2::personInstanceMethod1);
		
		System.out.println(Arrays.toString(personArray));
	// [Person2 [name=Ankit], Person2 [name=Raj], Person2 [name=Rohit], Person2 [name=Zuber]]
	
	}
}
