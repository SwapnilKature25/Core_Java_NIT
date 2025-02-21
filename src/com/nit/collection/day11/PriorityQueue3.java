package com.nit.collection.day11;

import java.util.PriorityQueue;

public class PriorityQueue3 {
	public static void main(String[] args) {
		PriorityQueue<String> pq1=new PriorityQueue<>();
		pq1.add("Red");
		pq1.add("Green");
		pq1.add("Black");
		pq1.add("White");
		System.out.println("Priority Queue1 : "+pq1);
		
		PriorityQueue<String> pq2=new PriorityQueue<>();
		pq2.add("Black");
		pq2.add("Orange");
		pq2.add("Pink");
		pq2.add("Red");
		System.out.println("Priority Queue2 : "+pq2);
		
		for (String q2 : pq2) {
			if(pq1.contains(q2))
			{
				System.out.println("Yes");
			}
			else System.out.println("No");
		}
		
	}
	
	/* 
Priority Queue1 : [Black, Red, Green, White]
Priority Queue2 : [Black, Orange, Pink, Red]
Yes
No
No
Yes
 */
}
