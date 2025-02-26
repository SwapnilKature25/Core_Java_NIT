package com.nit.stream_api.day1_2_3;

import java.util.stream.Stream;

public class StreamDemo4 {
	public static void main(String[] args) {
		Stream<Double> generate = Stream.generate(() -> Math.random());
		generate.limit(10).forEach(System.out::println);
		
		System.out.println("=========================");

		
		Stream<Integer> iterate =Stream.iterate(15, n -> n+1);
		iterate.limit(10).forEach(System.out::println);
		
	}
}
