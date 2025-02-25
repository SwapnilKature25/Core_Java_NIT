package com.nit.collection.generics;

import java.util.ArrayList;

class Animal2 {

}

class Dog22 extends Animal2 {
}

class Horse2 extends Animal2 {
}

public class WildCardDemo1 {

	public static void main(String[] args) {
//		Lower Bound - so adding element in the collection is allowed.
		ArrayList<? super Dog22> list = new ArrayList<Object>();
		list.add(new Dog22());

//	 	Upper Bound -  we can't add any element in the Collection.
		ArrayList<? extends Animal2> list1 = new ArrayList<Horse2>();
		list1.add(new Horse2()); // error [Not allowed]
	}

}