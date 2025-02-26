package com.nit.stream_api.day5;

import java.util.stream.IntStream;

public class SkipLimitDemo3 {
	public static void main(String[] args) {
		int num[]= {10};
		//Generate a stream of incresing numbers starting from 10
		IntStream.generate(()->num[0]++)
			.limit(5)
			.forEach(System.out::println);
	}
}
