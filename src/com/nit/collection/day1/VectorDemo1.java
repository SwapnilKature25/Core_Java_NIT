package com.nit.collection.day1;

import java.util.*;

class VectorDemo1 {
	public static void main(String args[]) {
		Vector obj = new Vector(4, 2);
		obj.addElement(new Integer(3));
		obj.addElement(new Integer(2));
		obj.addElement(new Integer(6));
		System.out.println(obj.elementAt(1));  // 2
		System.out.println(obj.capacity()); // 4
		obj.insertElementAt(new Integer(8), 2);
		System.out.println(obj);	// [3, 2, 8, 6]
		
		obj.removeAll(obj);
		System.out.println(obj.isEmpty()); // true
	}
}

