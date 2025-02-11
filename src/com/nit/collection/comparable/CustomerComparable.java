package com.nit.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;

record Customer(Integer id, String name) implements Comparable<Customer> 
{
	@Override
	public int compareTo( Customer c2) 
	{
		/*
		 * lexico graphical representation
		if(this.id() == c2.id())
		{
			return 0;
		}
		else if(this.id() > c2.id())
		{
			return 1;
		}
		else {
			return -1;
		}   */
	  return this.id - c2.id;  
	}
}



public class CustomerComparable {

	public static void main(String[] args) 
	{		
		ArrayList<Customer> listOfCustomers = new ArrayList<>();
		listOfCustomers.add(new Customer(333, "Scott"));
		listOfCustomers.add(new Customer(111, "Zuber"));
		listOfCustomers.add(new Customer(222, "Aryan"));
		
		System.out.println("Original Data :");
		listOfCustomers.forEach(System.out::println);
		
		Collections.sort(listOfCustomers);
		System.out.println("Data After sorting based on the ID :");
		listOfCustomers.forEach(System.out::println);
		
		
	}

}