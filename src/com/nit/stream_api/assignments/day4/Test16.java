package com.nit.stream_api.assignments.day4;

import java.util.Arrays;
import java.util.List;

public class Test16 {
	public static void main(String[] args) {
		List<String> al = Arrays.asList("A", "B", "C", "D");
		List<String> list = al.stream().skip(1).filter(x -> x.startsWith("B")).peek(x -> {}).toList();
		System.out.println(list); //{B}

	}

}
