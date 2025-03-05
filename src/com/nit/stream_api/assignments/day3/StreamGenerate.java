package com.nit.stream_api.assignments.day3;

import java.util.stream.Stream;

public class StreamGenerate {
	public static void main(String[] args) {
		//Case 4 [How to generate Infinite Stream]
	    //generate(Supplier<T> g)
//		Stream.generate(() -> Math.random()).limit(10).forEach(System.out::println);  
//		Stream.iterate(1, num -> num+1).limit(10).forEach(System.out::println);

		Stream.iterate(1,x -> x+2).limit(10).map(x -> x*x).forEach(System.out::println);
	}
}
