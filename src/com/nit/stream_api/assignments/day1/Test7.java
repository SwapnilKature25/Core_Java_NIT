package com.nit.stream_api.assignments.day1;

import java.util.Arrays;

//  WAP to convert Integer Array to String Representation

public class Test7 {
	public static void main(String[] args) {
		Integer[] numbers = {10, 20, 30, 40, 50};
		String string = Arrays.stream(numbers).map(n -> "number : "+n).toString();
//		string.for
	}
}
