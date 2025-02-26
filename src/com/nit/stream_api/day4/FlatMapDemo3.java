package com.nit.stream_api.day4;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapDemo3 {
	public static void main(String[] args) {
		List<Integer> primeNumbers = Arrays.asList(5,7,11);
		List<Integer> evenNumbers = Arrays.asList(2,4,6);
		List<Integer> oddNumbers = Arrays.asList(1,3,5);
		
		Set<Integer> collect=Arrays.asList(primeNumbers, evenNumbers, oddNumbers)
					.stream()
						.flatMap(list -> list.stream())
							.collect(Collectors.toSet());
		System.out.println(collect);
		
		
		
		
	}
}
