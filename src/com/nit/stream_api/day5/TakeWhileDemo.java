package com.nit.stream_api.day5;

import java.util.stream.Stream;

public class TakeWhileDemo {
	public static void main(String[] args) {
		Stream<Integer> numbers = Stream.of(10,11,12,8,9,13,22);
		numbers.takeWhile(n -> n > 9)
		.forEach(System.out::println);
		
		System.out.println("------------------------------");
	
		numbers =Stream.of(12,2,10,4,3,2,4,2,1);
		numbers.takeWhile(n -> n%2==0)
		.forEach(System.out::println);
		
		System.out.println("------------------------------");

		numbers=Stream.of(1,2,3,4,5,6,7,8,9);
		numbers.takeWhile(n -> n < 9)
		.forEach(System.out::println);
		
		System.out.println("------------------------------");

		Stream<String> names = Stream.of("Ravi","Aniket","Scott","Mike");
		names.takeWhile(str -> str.charAt(0)=='R')
		.forEach(System.out::println);
	}
}
