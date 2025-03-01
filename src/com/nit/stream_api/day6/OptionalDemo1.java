package com.nit.stream_api.day6;

import java.util.Optional;

public class OptionalDemo1 {
	public static void main(String[] args) {
		String str=null;
		Optional<String> container = Optional.ofNullable(str);
//		System.out.println("Value in the container : "+container.get());  // NoSuchElementException
		
		if(container.isPresent())
		{
			System.out.println("Value in the container : "+container.get());
		}
		else 
		{
			System.out.println("No value is available in the container");
		}
		
	}
}
