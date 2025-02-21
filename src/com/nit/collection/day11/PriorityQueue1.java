package com.nit.collection.day11;

import java.util.PriorityQueue;

public class PriorityQueue1 {
	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("Red");
		pq.add("Green");
		pq.add("Orange");
		pq.add("White");
		pq.add("Black");
		
		System.out.println(pq); // [Black, Green, Orange, White, Red]
		
		
/*
 			   Black
 		Green			orange
 white  	  Red
 	
 */
	}
}
