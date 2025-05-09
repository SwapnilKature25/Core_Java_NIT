package com.nit.map;


class Foo
{
	
}
public class SystemHashCode {

	public static void main(String[] args) 
	{
		String str1 = "india";
		String str2 = new String("india");
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println(".........................");
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(System.identityHashCode(f1));
		System.out.println(System.identityHashCode(f2));
		System.out.println(System.identityHashCode(Foo.class));
		
	}

}
