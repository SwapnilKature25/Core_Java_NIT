package com.nit.collection.day9;

import java.util.*;

public class Test4 {

	public static void main(String[] args) {
		Integer a = new Integer(4);
		Integer b = new Integer(8);
		Integer c = new Integer(4);
		HashSet hs = new HashSet();
		hs.add(a);
		hs.add(b);
		hs.add(c);
		System.out.println(hs);  // [4, 8]
	}
}
