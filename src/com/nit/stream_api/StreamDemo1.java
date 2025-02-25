package com.nit.stream_api;

import java.util.stream.*;

public class StreamDemo1 
{

	public static void main(String[] args) 
	{
		Stream<Integer> streamOfNumber= Stream.of(1,2,3,4,5,6,7,8);
		streamOfNumber.forEach(System.out::println);
	}

}
