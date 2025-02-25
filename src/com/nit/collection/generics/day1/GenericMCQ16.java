package com.nit.collection.generics.day1;


public class GenericMCQ16{
	public static void main(String[] args) {
		System.out.println(display(1));
		System.out.println(display("NareshIT"));
		System.out.println(display(3.25f));
		
	}
	public static<T> T display(T element)
	{
		T e = element;
		return e;
	}
}
