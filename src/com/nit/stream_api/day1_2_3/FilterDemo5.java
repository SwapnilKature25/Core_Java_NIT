package com.nit.stream_api.day1_2_3;

import java.util.Arrays;
import java.util.stream.Stream;

// WAP to print all the array elements which are divisible by 3 and 5

public class FilterDemo5 {
	
	public static void main(String[] args) 
	{
		Integer numbers[]= {15,21,20,30,45,60,90};
		Stream<Integer> streamOfNumbers = Arrays.stream(numbers);
		Object[] array = streamOfNumbers.filter(n -> n%3==0 && n%5==0).toArray();
		System.out.println("Numbers Divisible by both 3 & 5 are : "+Arrays.toString(array));
	}
}
