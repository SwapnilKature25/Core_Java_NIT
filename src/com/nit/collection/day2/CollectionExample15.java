package com.nit.collection.day2;

import java.util.ArrayList;

public class CollectionExample15 {
	public static void main(String argv[]) {

		ArrayList list = new ArrayList();
		ArrayList listStr = list;
		ArrayList listBuf = list;
		listStr.add(0, "Hello");
//		StringBuffer buff = listBuf.get(0);	// Type mismatch: cannot convert from Object to StringBuffer
		Object buff = listBuf.get(0);	// 
		System.out.println(buff.toString());	// hello
	}

}
