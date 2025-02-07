package com.nit.collection.day5;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertLinkedListToArrayList {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(121);
		list.add(122);
		list.add(123);
		list.add(124);
		
		ArrayList<Integer> arrayList = new ArrayList<>(list);
		System.out.println(arrayList);
	}
}		
