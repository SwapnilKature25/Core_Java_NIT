package com.nit.collection.generics.day1;

public class GenericMCQ17{
	public static void main(String[] args) {
		System.out.println(display(1).getClass());
		System.out.println(display("NareshIT").getClass());
		System.out.println(display(3.25f).getClass());
	}
	public static<E> E display(E element)
	{
		E e = element;
		return e;
	}
}

/* class java.lang.Integer
class java.lang.String
class java.lang.Float
 */