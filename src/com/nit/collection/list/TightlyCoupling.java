package com.nit.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TightlyCoupling {
	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(12);
		lst.add(22);
		lst.add(52);
		lst.add(42);
		
		List<Integer> lst2=new LinkedList<>(lst);
		lst2.forEach(System.out::println);
		Object[] array = lst2.toArray();
		System.out.println(Arrays.toString(array));
	}
}
