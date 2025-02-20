package com.nit.collection.queue;

import java.util.PriorityQueue;
public class PriorityQueueDemo2
{
      public static void main(String[] argv)
      {
            PriorityQueue<String> pq = new PriorityQueue<>();
            pq.add("2");
            pq.add("4");          
			pq.add("6");  
            System.out.print(pq.peek() + " ");  //2 
            pq.offer("1");
			pq.offer("9");
            pq.add("3");              
			System.out.println(pq);  // [1, 2, 3, 4, 9, 6]
            
            pq.remove("1");
            System.out.print(pq.poll() + " \n");  // 2 fetch and removed
            System.out.println(pq);  // [3, 4, 9, 6]
            
            if (pq.remove("2")) //false
		    {
                System.out.print(pq.poll() + " \n"); 
			}
            System.out.println(pq.poll() + " " + pq.peek()+"  "+pq.poll()); // 3 4 4
            System.out.println(pq.peek()); //6
	  }
}