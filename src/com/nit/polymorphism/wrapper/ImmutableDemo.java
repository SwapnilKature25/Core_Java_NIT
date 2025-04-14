package com.nit.polymorphism.wrapper;

public class ImmutableDemo {

	public static void main(String[] args) 
	{
		Integer i = new Integer(12);
        accept(i);
        System.out.println(i);       // 12    
	}
	
	public static void accept(Integer y)
	{
		y = 22;
		System.out.println(y);   // 22
	}

}
