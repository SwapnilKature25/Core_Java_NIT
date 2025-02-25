package com.nit.collection.generics.day1;


interface NareshIT8<T>
{
	void nit(T type);
}

class Test3 implements NareshIT8
{
	public void nit(Object type) 
	{
		System.out.println(type);
	};
}
public class GenericMCQ10{
	public static void main(String[] args) {
		Test3 test = new Test3();
		test.nit("Naresh I technologies");
		test.nit(1.66);	
	}
}

