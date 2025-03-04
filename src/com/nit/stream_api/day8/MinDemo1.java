package com.nit.stream_api.day8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class MinDemo1 {

	public static void main(String[] args) {
		List<Integer> listOfNumbers = Arrays.asList(10,20,5,49,23);
		
		Optional<Integer> min = listOfNumbers.stream().min(Integer::compareTo);
		
		min.ifPresent(System.out::println);
		
		
		int arr[] = {2,32,12,1,4};
		OptionalInt min2 = Arrays.stream(arr).min();
		min2.ifPresent(System.out::println);
		
		
	}

}
