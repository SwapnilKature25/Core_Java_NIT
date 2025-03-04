package com.nit.stream_api.day8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindFirstDemo1 {
	public static void main(String[] args) {
		Stream<String> players = Stream.of("Virat","Rohit","Raj","Bumrah");
		// parallel() will convert the single thread stream to parallel stream
		players.parallel().findFirst().ifPresent(System.out::println);
		
		List<String> asList = Arrays.asList("A", "B", "C");
		asList.parallelStream().findFirst()
		.ifPresent(System.out::println);
	}
}
