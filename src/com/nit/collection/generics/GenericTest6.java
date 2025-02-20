package com.nit.collection.generics;

//Mixing generic with non generic :
import java.util.*;

class Car {
}

public class GenericTest6 {
	public static void main(String[] args) {
		ArrayList<Car> a = new ArrayList<>();
		a.add(new Car());
		a.add(new Car());
		a.add(new Car());

		ArrayList b = a; // assigning Generic to raw type

		System.out.println(b);
	}
}