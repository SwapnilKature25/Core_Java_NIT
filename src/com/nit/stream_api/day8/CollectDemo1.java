package com.nit.stream_api.day8;

// join the elements by using joining() methods of collectors class

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectDemo1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a","b","c","d");
		String result = list.stream().collect(Collectors.joining("@"));
		System.out.println(result); // a@b@c@d
	}
}
