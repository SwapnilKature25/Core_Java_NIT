package com.nit.practice.stream_api.intermediate;

import java.util.stream.Stream;

public class DistinctDemo {
	public static void main(String[] args) {
		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 3, 4, 5);
		numbers.distinct().forEach(System.out::println);
	}
}
