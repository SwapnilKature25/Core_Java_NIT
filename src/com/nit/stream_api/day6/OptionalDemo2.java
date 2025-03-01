package com.nit.stream_api.day6;

import java.util.Optional;

public class OptionalDemo2 {
	public static void main(String[] args) {
		
		Integer i= null;
		Optional<Integer> contnr = Optional.ofNullable(i);
		System.out.println(contnr.get());  // java.util.NoSuchElementException
		
	}
}
