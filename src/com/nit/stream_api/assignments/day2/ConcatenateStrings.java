package com.nit.stream_api.assignments.day2;

import java.util.List;
import java.util.stream.Stream;

public class ConcatenateStrings {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Hello", "", "World", " ", "from", " ", "Java", "!");
	 stream.filter(str -> !(str.isEmpty())).forEach(System.out::print);
	}
}
