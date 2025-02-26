package com.nit.stream_api.day1_2_3;

import java.util.ArrayList;
import java.util.List;

// wap the each element of ArrayList and a constant value 10 and display the result in List format.

public class MapDemo1 {
	public static void main(String[] args) {
		ArrayList<Integer> listOfNumber = new ArrayList<>();
		listOfNumber.add(12);
		listOfNumber.add(22);
		listOfNumber.add(32);
		listOfNumber.add(56);
		listOfNumber.add(29);
		System.out.println("Original Data : "+listOfNumber);
		
		List<Integer> list = listOfNumber.stream().map(num -> num+10).toList();
		System.out.println("After Adding 10 : "+list);
		
	}
}
