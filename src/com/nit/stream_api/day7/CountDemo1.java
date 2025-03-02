package com.nit.stream_api.day7;

import java.util.stream.Stream;

public class CountDemo1 {

	public static void main(String[] args) {
		long count = Stream.of("Ravi","Raj","Alen","Mike","Jane").count();
		System.out.println(count);  //5
	
	}

}
