package com.nit.stream_api.day1;

import java.util.Arrays;

// WAP to filter all the prime numbers from given array

public class FilterDemo7 {
	public static void main(String[] args)
	{
		int[] numbers = {2,3,4,5,6,7,8,9,10,11,13};
		int[] primeNumbers=Arrays.stream(numbers).filter(FilterDemo7::isPrime).toArray();
		
		System.out.println("Prime Numbers : "+Arrays.toString(primeNumbers));
	}
	
	//Method to check if a number is a prime or not
	private static boolean isPrime(int num)
	{
		if(num < 2)
		{
			return false;
		}
		for(int i=2; i<Math.sqrt(num); i++)
		{
			if(num%i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
