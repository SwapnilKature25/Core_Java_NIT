package com.nit.collection.day2;

import java.util.ArrayList;

public class CollectionExample7 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(5);
		al.add("");
		al.add(10);
		System.out.println(al.contains(6));
		System.out.println(al.contains(10));
		System.out.println(al.contains(null));
	}

}
