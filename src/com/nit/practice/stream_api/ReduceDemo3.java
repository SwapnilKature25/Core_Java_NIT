	package com.nit.practice.stream_api;

	//Finding the multiplication of all numbers

	import java.util.Arrays;
	import java.util.List;
	import java.util.Optional;

	public class ReduceDemo3
	{
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	        Optional<Integer> product = numbers.stream()
	                                           .reduce((a, b) -> a * b);

	        product.ifPresent(System.out::println);   // 120
	        
	        System.out.println("==========================");
	        Integer reduce = numbers.stream().reduce(2,(a,b)-> a*b);  // 240
	        System.out.println(reduce);
	       
	    }
	}