package com.nit.stream_api.day5;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PeekDemo2 {
	public static void main(String[] args) {
		int[] array = IntStream.of(2,4,6,8,10)
			.peek(n -> System.out.println("Original Data "+n))
			.map(n -> n*n)
			.peek(n -> System.out.println("After Square "+n )).toArray();
		
		System.out.println(Arrays.toString(array));
		
	}
}
