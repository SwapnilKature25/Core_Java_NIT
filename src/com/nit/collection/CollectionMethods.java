package com.nit.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethods {
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		Iterable i=null;
		System.out.println("1. add() ");
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(444);
		System.out.println(list);
		
		List<Integer> list2=new ArrayList<Integer>();
		System.out.println("\n2. addAll() ");
		list2.add(444);
		list2.add(555);
		list2.add(666);

//		list.addAll(list2);
		System.out.println(list);
		
		System.out.println("\n3. remove() ");
//		remove based on index
		list.remove(1);
		System.out.println(list);
	
		System.out.println("\n4. removeAll() ");
		list.removeAll(list);
		System.out.println(list);
		
		System.out.println("\n5. retailAll() ");
		list2.retainAll(list);	// common element
		System.out.println(list2);
		
		
		System.out.println("\n6. size() ");
		System.out.println(list.size());
		
		
		list2.add(888);
		list2.add(999);
		System.out.println("\n7. clear() ");
		System.out.println(list2);
		list2.clear();
		System.out.println("After retainAll() : "+list2);
		
	}
}
