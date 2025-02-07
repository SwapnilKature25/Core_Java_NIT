package com.nit.collection.day5;
//Q1) Write a program to reverse ArrayList in java?
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListReverse {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		
		System.out.println("By using ArrayList sort()");
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		
		System.out.println("By using Collections sort()");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		
	}
}
