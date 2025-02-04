package com.nit.collection;

import java.util.Vector;

public class VectorDynamicNature {
	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<>(10,2);
		v.add(111);
		v.add(222);
		v.add(333);
		v.add(444);
		v.add(111);
		v.add(222);
		v.add(333);
		v.add(444);
		v.add(333);
		v.add(333);
		v.add(333);
		v.add(333);
		v.add(333);
		System.out.println("Capacity : "+v.capacity());
		System.out.println("Size : "+v.size());
		
		
	}
}
