package com.nit.collection.day5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTraverse {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(111);
		list.add(222);
		list.add(444);
		list.add(333);
		
		list.forEach(t -> System.out.println(t));
		
		ListIterator lItr=list.listIterator();
		System.out.println("Traversing elements in forward direction");
		while(lItr.hasNext())
		{
			System.out.println(lItr.next());
		}
		System.out.println("Traversing elements in Backward direction");
		while(lItr.hasPrevious())
		{
			System.out.println(lItr.previous());
		}
		
	}
}
