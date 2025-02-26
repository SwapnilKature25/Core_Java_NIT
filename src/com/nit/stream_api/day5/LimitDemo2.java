package com.nit.stream_api.day5;

import java.util.stream.Stream;

public class LimitDemo2 {

	public static void main(String[] args) {
		
		//random number generate
		Stream.generate(() -> Math.random()).limit(10).forEach(System.out::println);
		
		Stream.iterate(1, n-> n+5).limit(10).forEach(System.out::println);
	}

}
