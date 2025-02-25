package com.nit.collection.generics.day1;


interface NareshIT9<T>
{
	void nit(T type);
}

class StringTest implements NareshIT9<String>
{

	@Override
	public void nit(String type) {
		System.out.println(type);
	}
	
}
public class GenericMCQ12{
	public static void main(String[] args) {
		StringTest test = new StringTest();
		test.nit("Naresh I technologies");
		test.nit(1.66);
	}
}

