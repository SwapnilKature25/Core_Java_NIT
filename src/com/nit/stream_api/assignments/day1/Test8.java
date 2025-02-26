package com.nit.stream_api.assignments.day1;

import java.util.Arrays;

public class Test8 {
	public static void main(String[] args) {

	    String[] names = {"Virat", "Sanju", "Rohit", "Bumrah"};
	    Object[]  upper = Arrays.stream(names).map(str -> str.toUpperCase()).toArray();
	    System.out.println(Arrays.toString(upper));
	}
}
