package com.nit.stream_api.assignments.day4;

import java.util.List;

public class Test18 {
	public static void main(String[] args) {
		List<Integer> list = List.of(54,34,234,23,364,3);
		list.stream().map(k -> k-k+2).filter(k -> k!=0).map(k -> 100)
		.forEach(k -> System.out.print(k - 10 + " ")); // 90 90 90 90 90 90 
	}

}
