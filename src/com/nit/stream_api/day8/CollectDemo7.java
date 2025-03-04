package com.nit.stream_api.day8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Count how many elements are partition based on given predicate

public class CollectDemo7 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		
		Map<Boolean, Long> partitioned = numbers.stream()
		.collect(Collectors.partitioningBy(
				n -> n%2==1,
				Collectors.counting()));
		
		System.out.println(partitioned);
		//{false=5, true=5}
	}

}
