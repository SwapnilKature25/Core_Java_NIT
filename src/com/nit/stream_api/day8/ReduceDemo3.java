package com.nit.stream_api.day8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Finding the multiplication of all numbers

public class ReduceDemo3 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		Optional<Integer> product = numbers.stream().reduce((a,b)-> a*b);
		product.ifPresent(System.out::println); //120
		
		  System.out.println("==========================");
		  
		Integer prod = numbers.stream().reduce(1, (a,b)-> a*b );
		System.out.println(prod); //120
	
	} 

}
