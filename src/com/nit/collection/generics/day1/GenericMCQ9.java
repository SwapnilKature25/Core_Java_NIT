package com.nit.collection.generics.day1;


class NareshIT6<T extends Float>
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
public class GenericMCQ9 {
	public static void main(String[] args) {
		NareshIT6<Float> nit1 = new NareshIT6();
		nit1.set(9999.0f);
		System.out.println(nit1.get());
	}
}
