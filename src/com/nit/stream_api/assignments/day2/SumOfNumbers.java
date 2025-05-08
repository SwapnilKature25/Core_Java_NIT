package com.nit.stream_api.assignments.day2;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class SumOfNumbers {
	public static void main(String[] args) {
		int[] arr= {-3, 2, -5, 6, -1, 4};
		OptionalInt reduce = Arrays.stream(arr)
				.filter(num -> num>0)
				.map(n -> n*n).reduce((s1,s2)->s1+s2);
		System.out.println(reduce.getAsInt());
	}
}
