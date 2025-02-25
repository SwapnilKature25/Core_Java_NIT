package com.nit.stream_api.day1;

import java.util.List;
import java.util.stream.Collectors;

// WAP to accept all the names from collection whose length is greater than 3 and convert into list

public class StreamToCollection2 {
	public static void main(String[] args) {
		 List<String> lst=List.of("Raj", "Matin", "Sky", "Alen", "Smith");
		 List<String> collect = lst.stream().filter(str -> str.length() > 3)
		 		.collect(Collectors.toList());
		 
		System.out.println(collect);
	}
}
