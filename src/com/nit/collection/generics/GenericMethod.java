package com.nit.collection.generics;
 
//Generic Method

public class GenericMethod 
{
	public static void main(String[] args) 
	{
		Integer []intArr = {60,20,30,40,50};
		printArray(intArr);
		
		System.out.println(".............");
		
		String []cities = {"Hyderabad", "Banglore", "Mumbai", "Kolkata"};
		printArray(cities);
		
	}
	
	public static <T> void printArray(T[] array)
	{
		for(T element : array )
		{
			System.out.println(element);
		}
	}

}