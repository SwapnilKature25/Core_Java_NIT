package com.nit.stream_api.assignments.day4;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(12);
		list.add(114);
		List<Integer> list2 = list.stream().distinct().toList();
		System.out.println(list2);

	}

}
