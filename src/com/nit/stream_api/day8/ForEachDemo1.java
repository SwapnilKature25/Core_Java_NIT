package com.nit.stream_api.day8;

import java.util.stream.Stream;

public class ForEachDemo1 {

	public static void main(String[] args) {
		Stream<Integer> streamOfNum = Stream.of(1,2,3,4,5,6,7,8,9);
		streamOfNum.forEach(System.out::println);
				
	}

}
