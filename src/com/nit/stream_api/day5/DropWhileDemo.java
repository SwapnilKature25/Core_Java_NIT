package com.nit.stream_api.day5;

import java.util.stream.Stream;

public class DropWhileDemo {

	public static void main(String[] args) {
		
		Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,7,8,9);
		numbers.dropWhile(n -> n<7).forEach(System.out::println);
		
		System.out.println();
		
		numbers=Stream.of(15,8,7,9,5,6,7,8,9,10);
		numbers.dropWhile(n -> n>5).forEach(System.out::println);
		
		
	}

}
