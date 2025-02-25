package com.nit.stream_api.day1;

import java.util.stream.Stream;

// WAP to find the cube of all the even numbers from the given list

public class MapDemo2 {
	public static void main(String[] args) {
		Stream<Integer> of=Stream.of(1,2,3,4,5,6,7,8,10);
		
		of.filter(num -> num%2==0).map(n -> n*n*n).forEach(System.out::println);
	}
}
