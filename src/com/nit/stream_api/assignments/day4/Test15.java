package com.nit.stream_api.assignments.day4;

import java.util.Arrays;
import java.util.List;

public class Test15 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList();
		String result = words.stream().map(String::toUpperCase).reduce((s1, s2) -> s1 + s2).orElse("NULL");
		System.out.println(result);  //NULL
	}

}
