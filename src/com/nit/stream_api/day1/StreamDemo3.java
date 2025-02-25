package com.nit.stream_api.day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo3 {
	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		// Converting collection object into String
		Stream<Integer> stream = list.stream();
		stream.forEach(System.out::println);
		
		System.out.println("=========================");

		List<String> names=List.of("Scott", "Alen", "Smith", "martin");
		Stream<String> parallelStream = names.parallelStream();
		parallelStream.forEach(System.out::println);

		 
		
	}
}
