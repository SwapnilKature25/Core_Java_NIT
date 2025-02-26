package com.nit.stream_api.assignments.day1;
//  WAP to convert boolean value to "Yes" or "No"
//Boolean[] flags = {true, false, true, false, true};
//Yes/No Values: [Yes, No, Yes, No, Yes]

import java.util.Arrays;

public class Test9 {
	public static void main(String[] args) {

		Boolean[] flags = {true, false, true, false, true};
		Object[] array = Arrays.stream(flags).map(t -> t?"Yes":"No").toArray();
		System.out.println(Arrays.toString(array));
	}
}
