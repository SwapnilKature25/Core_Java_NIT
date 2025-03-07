package com.nit.practice.stream_api.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {
	public static void main(String[] args) {
	       List<Integer> listOfNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);  
	      
	       //add a constant value 10 to all the numbers
	       List<Integer> numbers = listOfNumbers.stream().map( num -> num+10).collect(Collectors.toList());
//	       collect.forEach(System.out::println);
	       System.out.println(numbers);

	       System.out.println();
	       
	       //Fetch all the unique even numbers and find the cube of those numbers
	       
	       List<Integer> evenCube = listOfNumbers.stream().distinct().filter(e -> e%2==0)
	       .map(c -> c*c*c).collect(Collectors.toList());
	       System.out.println(evenCube);
	}
}
