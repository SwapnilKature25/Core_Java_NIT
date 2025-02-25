package com.nit.stream_api.day2;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo1 {
	public static void main(String[] args) {
		List<String> ind = Arrays.asList("Virat", "Rohit","YJ","Rahul","Shami");
		List<String> pak = Arrays.asList("Babar","Rizwan", "Salman", "Afridi");
		
		List<List<String>> icc = Arrays.asList(ind,pak);
		System.out.println(icc);
		
		
		
	}
}
