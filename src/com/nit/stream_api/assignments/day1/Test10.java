package com.nit.stream_api.assignments.day1;
// WAP to extract First Letter of Each Word from String Array

import java.util.Arrays;

public class Test10 {
	public static void main(String[] args) {
		String []names = {"James", "Aryan", "Vibha", "Aniket"};
		Object[] array = Arrays.stream(names).map(str -> str.charAt(0)).toArray();
		System.out.println("First Letters : "+Arrays.toString(array));
	}
}
