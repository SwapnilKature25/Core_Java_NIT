package com.nit.stream_api.day5;

import java.util.Arrays;
import java.util.List;

public class SkipDemo1 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list.stream().skip(5).forEach(System.out::println);
	}

}
