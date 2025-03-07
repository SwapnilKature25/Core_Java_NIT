package com.nit.practice.stream_api;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamCreationMethods {

	public static void main(String[] args) {
		
		// stream()
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(3);
		//Collections Object to Stream
		Stream<Integer> strm = list.stream();
		strm.forEach(p -> System.out.println(p));
		
		System.out.println("===========================");
		
		
		// Stream.of()
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
		stream.forEach(System.out::println);
		System.out.println();
		//Anonymous Array Object (Stream of Arrays)
		Stream<Integer> arr = Stream.of( new Integer[]{15,29,45,8,16} );
		arr.forEach(p -> System.out.println(p));
	}

}
