package com.nit.stream_api_practice;

import java.util.Arrays;

class Person 
{
    private String name;   //Person persons[] = new Person[5];

    public Person(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
    
    
}

public class ConstructorReferenceDemo3
{
    public static void main(String[] args) 
    {
        Function<Integer,Person[]> fn2=Person[]::new;
        Person[] persons = fn2.apply(3);
        persons[0]=new Person("Scott");
        persons[1]=new Person("Alex");
        persons[2]=new Person("Allen");
        System.out.println(Arrays.toString(persons));
    }
}