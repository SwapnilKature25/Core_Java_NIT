package com.nit.stream_api.day6;

import java.util.Optional;

public class OptionalDemo3 {
	public static void main(String[] args) {
		String str="Hyderabad";
		Optional<String> cntr = Optional.ofNullable(str);
		String value= cntr.orElse("No value in the container");
		System.out.println(value);
		
		System.out.println("================");
		
		Double d1 = null;
		Optional<Double> ctr = Optional.ofNullable(d1);
		ctr.ifPresent(System.out::println);
		
	}
}
