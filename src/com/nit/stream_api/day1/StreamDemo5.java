package com.nit.stream_api.day1;

import java.util.stream.Stream;

//Program to Show once stream is closed or operated then we can't reuse.
public class StreamDemo5 {
		public static void main(String[] args) 
		{
			Stream<String> streamOfString = Stream.of("Raj","Scott","Smith","Mike");
			streamOfString.forEach(System.out::println);
			
			System.err.println("***********************************");
			
			streamOfString.forEach(System.out::println);  // Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		
		}
}
