package com.nit.practice.stream_api.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Flattening of prime, even and odd number

public class FlatMapDemo3 {

	public static void main(String[] args) {
		  List<Integer> primeNumbers = Arrays.asList(5,7,11);
	      List<Integer> evenNumbers = Arrays.asList(2,4,6);
	      List<Integer> oddNumbers = List.of(1,3,5);
	      
	      List<List<Integer>> numbers = Arrays.asList(primeNumbers, evenNumbers, oddNumbers);
	      List<Integer> num = numbers
	    		 .stream() 
	    		 .flatMap(list -> list.stream())
	    		 .collect(Collectors.toList());
	      System.out.println(num);   // [5, 7, 11, 2, 4, 6, 1, 3, 5]

	}	
}
