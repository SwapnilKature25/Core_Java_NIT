package com.nit.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo 
{
      public static void main(String[] argv)
      {
            PriorityQueue<Object> pq = new PriorityQueue<>();
            pq.add("Orange");
			pq.add("Apple");
			pq.add("Mango");
			pq.add("Guava");
			pq.add("Grapes");
			
			//pq.add(null); // Inavlid
			//pq.add(23);    //Invalid
			
			System.out.println(pq);    // [Apple, Grapes, Mango, Orange, Guava]  - by using binary heap tree          

      }
}