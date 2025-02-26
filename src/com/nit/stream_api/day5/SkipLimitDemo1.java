package com.nit.stream_api.day5;

import java.util.Random;
import java.util.stream.IntStream;

public class SkipLimitDemo1 {
	public static void main(String[] args) {
		
		Random rr=new Random();
		IntStream.generate(()-> rr.nextInt(100)).limit(10).forEach(System.out::println);

		IntStream.iterate(1, n->n+1).limit(10).forEach(System.out::println);
		
	}
}
