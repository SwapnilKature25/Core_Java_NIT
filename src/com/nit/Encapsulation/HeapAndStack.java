package com.nit.Encapsulation;


public class HeapAndStack
{	
	private Integer i1 = 900;

	public static void main(String[] args) 
	{
		HeapAndStack s1 = new HeapAndStack();    // 1000x  
		                              
		HeapAndStack s2 = new HeapAndStack();    // 2000x 

		HeapAndStack s3 = modify(s2);      // 2000x  // 4000x gor gc

		s1 = null;    // 1000x elg for gc

         //GC [4 objects 1000x,2000x, 5000x and 6000x are eligible for GC]
		 
		System.out.println(s2.i1);		 // 9 
	}
    public static HeapAndStack modify(HeapAndStack s)   // 2000x
	{
		s.i1=9;      // 2000x  => i1=9
		s = new HeapAndStack();    // 3000x
		s.i1= 20;  
        System.out.println(s.i1);   // 20
		s=null;   // 3000x for gc
		return s;
	}
}