package com.nit.collection.generics.day1;


class NareshIT4<T>
{
	private T test;
	
	public void set(T test)
	{
		this.test = test;
	}
	public T get()
	 {
		 return test;
	 }
}

public class GenericMCQ7 {
	public static void main(String[] args) {
		NareshIT4<String> nit = new NareshIT4();
		nit.set(new String("Naresh I Technologies"));
		String str = nit.get();
		System.out.println(str);
	}
}
