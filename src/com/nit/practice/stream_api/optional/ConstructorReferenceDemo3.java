package com.nit.practice.stream_api.optional;

import java.util.function.Function;

class Accept
{
	private int x;
	
	public Accept(int x)
	{
		this.x = x;
	}
	
	public int getX()
	{
		return this.x;
	}
}


public class ConstructorReferenceDemo3 {

	public static void main(String[] args) 
	{
		Collection c=null;
		Function<Integer,Accept> f1 = Accept::new;
		Accept obj = f1.apply(90);
		System.out.println(obj.getX());
	}

}
