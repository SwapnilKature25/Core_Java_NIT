package com.nit.stream_api.day5;

import java.util.List;

public class LimitDemo1 {
	public static void main(String[] args) {
		List<String> listOfPlayer = List.of("Rohit", "Virat","Gill","Akshar");
		listOfPlayer.stream().limit(2).forEach(System.out::println);
	}
}
