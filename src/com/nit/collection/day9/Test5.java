package com.nit.collection.day9;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Test5 {
	private String a;

	public Test5(String a) {
		this.a = a;
	}

	public static void main(String[] args) {
		HashSet<Object> hash = new HashSet<Object>();
		Test5 ms1 = new Test5("MarutiCurvo");
		Test5 ms2 = new Test5("MarutiCurvo");
		String a1 = new String("MarutiCurvo");
		String a2 = new String("MarutiCurvo");
		hash.add(ms1);
		hash.add(ms2);
		hash.add(a1);
		hash.add(a2);
//		System.out.println(hash.size());  //3
		
		
		/*
//		ctrl + shift + 0 => to import all packages at once
		SortedSet<Integer> set = new TreeSet<Integer>();
		set.add(7);
		set.add(-12);
		SortedSet<Integer> sub = set.subSet(-20, 20);
		sub.add(9);
		System.out.format("%d %d", set.size(), sub.size());  // 3 3

//		System.out.println(set.hashCode());
//		System.out.println(sub.hashCode());
		
		*/
		
		
		NavigableSet<Integer> set = new TreeSet<Integer>();
	    set.add(-12);
	    set.add(24);
	    System.out.format("%d %d %d %d",
	        set.lower(-12),
	        set.lower(0),
	        set.lower(24),
	        set.lower(100)
	    );   // null -12 -12 24

		
		
		
		
		
	}
}
