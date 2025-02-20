package com.nit.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	
	public static List convertToList(String arr[])
	{
		List<String> list=new ArrayList<>(); 
		
		for (String str : arr) {
			list.add(str);
		}
	
		return list;
	}
	
	public static void main(String[] args) {
		String arr1[]= {"Apple", "Orange", "Kiwi"};
		System.out.println("Array Elements : \n"+Arrays.toString(arr1));

		List convertToList = convertToList(arr1);
		System.out.println("\nAfter Converting to List : ");
		convertToList.forEach(System.out::println);

	}
}
