package com.nit.practice.stream_api.optional;

import java.util.Arrays;
import java.util.function.Function;

// How to create Array Object using Constructor reference :

class Person
{
	private String name;
	public Person(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		int arr[];
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
}
public class ConstructorReferenceDemo2 {
	public static void main(String[] args) {
		Function<Integer,Person[]> fn2 = Person[]::new;
		Person[] persons = fn2.apply(3); // 3 is the size of the array 
		persons[0] = new Person("ALen");
		persons[1] = new Person("Alex");
		persons[2] = new Person("Mike");
		System.out.println(Arrays.toString(persons));
	}
}
