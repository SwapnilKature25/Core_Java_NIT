package com.nit.stream_api.assignments.day4;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("BC");
		al.add("CDE");
		al.add("DEFG");
		List<String> list = al.stream().filter(x -> x.length() >= 2).peek(x -> {}).toList(); // [BC, CDE, DEFG]
		System.out.println(list);
	}

}
