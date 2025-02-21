package com.nit.collection.day11;

import java.util.PriorityQueue;

public class PriorityQueue2 {
	public static void main(String[] args) {
		PriorityQueue<String> queue1=new PriorityQueue<>();
		queue1.add("Red");
		queue1.add("Green");
		queue1.add("Orange");
		System.out.println("Priority Queue1 : "+queue1);
		PriorityQueue<String> queue2=new PriorityQueue<>();
		queue2.add("Pink");
		queue2.add("White");
		queue2.add("Black");
		System.out.println("Priority Queue2 : "+queue2);
		
		queue1.addAll(queue2);
		System.out.println("Priority Queue1 : "+queue1);
		
	}
}
