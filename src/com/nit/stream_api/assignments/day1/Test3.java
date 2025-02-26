package com.nit.stream_api.assignments.day1;

import java.util.Arrays;

//Q3) WAP to print all the Prime Numbers from an Integer Array.
public class Test3 
{
	public static void main(String[] args) 
	{
		  Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		  Object[] array = Arrays.stream(numbers).filter(str -> Test3.isPrime(str)).toArray();
		  System.out.println("Prime numbers  : "+Arrays.toString(array));
	}
	
	public static boolean isPrime(Integer num)
	{
		int count=2;
		if(num < 2)
		{
			return true;
		}
		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0) count++;
			if(count > 2) return false;
		}
	    return true;
	}
}
