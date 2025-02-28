package com.nit.stream_api.assignments.day4;

import java.util.Comparator;
import java.util.TreeSet;

public class Test9 {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet=new TreeSet<Integer>((x,y)->y.compareTo(x));
		treeSet.add(10); 
		treeSet.add(14);
		treeSet.add(13);
		System.out.println(treeSet);
		treeSet.stream().sorted(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 + o2;
			}
		}).forEach(System.out::println);
		
		/*
		[14, 13, 10]
				14
				13
				10
		*/
	}

}
