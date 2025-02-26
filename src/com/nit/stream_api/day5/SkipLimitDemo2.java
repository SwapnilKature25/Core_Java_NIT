package com.nit.stream_api.day5;

import java.util.stream.IntStream;

public class SkipLimitDemo2 {
	public static void main(String[] args) {
		//Generate a fixed number
		IntStream.generate(()->10).limit(5).forEach(System.out::println);
	}
}
