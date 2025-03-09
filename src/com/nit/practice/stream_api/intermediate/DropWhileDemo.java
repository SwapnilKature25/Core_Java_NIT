package com.nit.practice.stream_api.intermediate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DropWhileDemo {

	public static void main(String[] args) {
		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> collect = numbers.dropWhile(n -> n<7).collect(Collectors.toList());
		System.out.println(collect);
		
		System.out.println("=============");
		
		numbers = Stream.of(15, 8, 7, 9, 5, 6, 7, 8, 9, 10);
		List<Integer> collect2 = numbers.dropWhile(n -> n > 5).collect(Collectors.toList());
		System.out.println(collect2);
	
	}

}
