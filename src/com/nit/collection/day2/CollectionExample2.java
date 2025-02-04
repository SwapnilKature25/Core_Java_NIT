package com.nit.collection.day2;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExample2 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("25");
		al.add("Naresh");
		al.add("A");
		al.add("37");
		Iterator<String> it = al.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");	// 25 Naresh A 37 
//		System.out.print(it+" ");	//Run time error
	}
}

