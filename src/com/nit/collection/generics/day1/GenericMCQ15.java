package com.nit.collection.generics.day1;

class NareshIT44<T>
{
	
}
public class GenericMCQ15{
	public static void main(String[] args) {	
		NareshIT44<String> str = new NareshIT44();
		NareshIT44<Float> flo = new NareshIT44();
		System.out.println(str.getClass().equals(flo.getClass())); //true
	}
}
