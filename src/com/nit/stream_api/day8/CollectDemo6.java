package com.nit.stream_api.day8;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

// Partition the given number based on the predicate and convert to set
public class CollectDemo6 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10,1,3);
	
		Map<Boolean, Set<Integer>> partitioned = numbers.stream()
		.collect(Collectors.partitioningBy(
				n -> n%2==1,
				Collectors.toSet()));
		
		System.out.println(partitioned);
		// {false=[2, 4, 6, 8, 10], true=[1, 3, 5, 7, 9]}
	}

}
