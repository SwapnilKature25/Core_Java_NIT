package com.nit.practice.stream_api;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxDemo {

	public static void main(String[] args)
	{
		List<String> listOfFruits = List.of("Apple","Orange","Mango","Grapes","Pomogranate");
		
		Optional<String> max = listOfFruits.stream().max(Comparator.comparingInt(String::length));
		
		max.ifPresent(System.out::println);
	}

}