package com.nit.practice.stream_api.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMapToIntDemo1 {

	public static void main(String[] args) {
		int []a1 = new int[] {1,2,3};
		int []a2 = new int[] {4,5,6};
		int []a3 = new int[] {7,8,9};
		
		List<int[]> numbers = Arrays.asList(a1,a2,a3);
		IntStream flatMapToInt = numbers.stream().flatMapToInt(array -> IntStream.of(array));
		flatMapToInt.forEach(System.out::println);
	}

}
