package com.nit.collection.day2;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionExample8 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(50);
		al.add(25);
		ListIterator li = al.listIterator();
		while(li.hasNext())
			System.out.println(li.next());
		li.add(22);		//false
//		al.add(22);		// true
		System.out.println(li.hasNext());
	}

}
