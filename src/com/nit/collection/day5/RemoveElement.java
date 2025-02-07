package com.nit.collection.day5;

import java.util.*;

public class RemoveElement {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(111);
		list.add(444);
		list.add(333);
		list.add(222);
//		list.remove(1);		// list remove()
		list.remove(Integer.valueOf(111));  // Collection remove()
		
		list.forEach(r -> System.out.println(r));
		
	}
}
