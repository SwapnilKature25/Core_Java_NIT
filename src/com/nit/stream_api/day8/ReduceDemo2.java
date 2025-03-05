package com.nit.stream_api.day8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
// Finding the maximum number 
public class ReduceDemo2 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,2,3,4,5);
		Optional<Integer> reduce = numbers.stream().reduce(Integer::max);
		reduce.ifPresent(System.out::println);  // 10
	}

}
