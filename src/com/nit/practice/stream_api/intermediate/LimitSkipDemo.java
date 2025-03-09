package com.nit.practice.stream_api.intermediate;

import java.util.stream.Stream;

public class LimitSkipDemo {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("Virat", "Rohit", "Dhoni", "Zaheer", "Raina","Sahwag","Sachin","Bumrah");
		s.limit(7).forEach(System.out::println);		
		 
		System.out.println("..............");
		 
		 Stream<String> of = Stream.of("Virat", "Rohit", "Rahul","Gill", "Pant","Bumrah","Nitish");
		 of.skip(3).forEach(System.out::println);

	}

}
