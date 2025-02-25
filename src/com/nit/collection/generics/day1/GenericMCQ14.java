package com.nit.collection.generics.day1;

class NareshIT33<T>
{
	
}
public class GenericMCQ14{
	public static void main(String[] args) {	
		NareshIT33<String> str = new NareshIT33();
		NareshIT33<Float> flo = new NareshIT33();
		System.out.println(str.equals(flo));  //false
	}
}

