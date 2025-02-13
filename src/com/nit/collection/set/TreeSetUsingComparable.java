package com.nit.collection.set;

//How to sort TreeSet by using Comparable :

import java.util.Iterator;
import java.util.TreeSet;

record Employee(Integer id, String name) implements Comparable<Employee>
{
	@Override
	public int compareTo(Employee e2) 
	{
		return Integer.compare(this.id(), e2.id());
	}

	
}

public class TreeSetUsingComparable
{
	public static void main(String[] args) 
	{
    TreeSet<Employee> ts1 = new TreeSet<Employee>();
    ts1.add(new Employee(333, "Raj"));
    ts1.add(new Employee(111, "Zuber"));
    ts1.add(new Employee(222, "Aryan"));      
    System.out.println(ts1);
    
   Iterator<Employee> descItr = ts1.descendingIterator();
   descItr.forEachRemaining(System.out::println); 
    
	}

}