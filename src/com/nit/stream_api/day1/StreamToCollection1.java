package com.nit.stream_api.day1;
// WAP to accept only odd numbers from the collection where duplicates are not allowed

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamToCollection1 {
	public static void main(String[] args) 
	{
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7);
		Set<Integer> collect=numbers.stream().filter(num -> num%2==1).collect(Collectors.toSet());
		System.out.println(collect);
		
	}
}
