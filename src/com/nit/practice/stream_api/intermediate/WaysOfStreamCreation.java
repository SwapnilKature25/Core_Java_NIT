package com.nit.practice.stream_api.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class WaysOfStreamCreation {

	public static void main(String[] args) {
//		There are 4 ways to craete the Stream
		
		// 1
		List<Integer> list = List.of(1,2,3);
		list.forEach(System.out::println);
		
		System.out.println("=====================");
		
		//2
		double arr[] = {1.2, 2.3, 3.4};
		DoubleStream doubleStream = Arrays.stream(arr);
		doubleStream.forEach(System.out::println);
		
		System.out.println("=====================");
		
		//3
		Stream.of(11,22,33).forEach(System.out::println);
		
		System.out.println("=====================");
		
		//4
//		[How to generate Infinite Stream]
		Stream.generate( ()-> Math.random() ).limit(10).forEach(System.out::println);
		Stream.iterate(1, num -> num+2).limit(10).forEach(System.out::println);
	
	}

}
