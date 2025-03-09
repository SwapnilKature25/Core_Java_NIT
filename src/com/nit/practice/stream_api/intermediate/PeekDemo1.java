package com.nit.practice.stream_api.intermediate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekDemo1 {
	public static void main(String[] args) {
		Stream<String> streamOfFruits = Stream.of("Apple","Mango","Grapes","Kiwi","pomogranate");
		List<Integer> collect = streamOfFruits
		.peek(str -> System.out.println("Peeking from original : "+str.toUpperCase()))
		.map(fruit -> fruit.length())
		.collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
