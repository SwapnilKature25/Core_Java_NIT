package com.nit.collection.queue;

import java.util.PriorityQueue;
public class PriorityQueueDemo1
{
      public static void main(String[] argv)
      {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            pq.add(11);
            pq.add(2);
            pq.add(4);          
            pq.add(6);          
//			pq.offer(6);
           System.out.println(pq);  // [2, 6, 4, 11]
	  }
}

/*       
Binary Heap Tree Structure :

		2
	6		4
11

 */