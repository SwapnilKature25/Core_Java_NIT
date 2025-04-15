package com.nit.practice.stream_api;

import java.util.stream.Stream;

public class StreamOperation {

	public static void main(String[] args) 
	{
		System.out.println("Main");
	  Stream<Integer> of = Stream.of(1,2,3,4,5,6,7,8,9,10);
	  of.filter(num -> num % 2 ==0).forEach(System.out::println); //Stream is closed OR Consumed (final Operation)
	  
	  of.forEach(System.out::println); //java.lang.IllegalStateException
	  
	}

}