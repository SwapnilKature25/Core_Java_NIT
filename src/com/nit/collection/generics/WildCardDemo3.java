package com.nit.collection.generics;

import java.util.ArrayList;
class Parent
{
	
}

public class WildCardDemo3 {
	public static void main(String[] args) {
		var<?> lp = new ArrayList<Parent>();
		lp.add(new Parent());
		System.out.println("Wild card...."); //Wild card....
	}
}
