package com.nit.stream_api.day5;

import java.util.stream.IntStream;

public class SkipLimitDemo4 {
	public static void main(String[] args) {
		int fib[] = {0,1};
		
		// Generate Fibonacci sequence
		IntStream.generate(()->{
			int next = fib[0]+fib[1];
			fib[0]=fib[1];
			fib[1]=next;
			return fib[0];
		})
		.limit(10)
		.forEach(System.out::println);
	}
}
