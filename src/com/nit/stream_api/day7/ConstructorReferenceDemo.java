package com.nit.stream_api.day7;


@FunctionalInterface
interface Callable
{
	Test2 call();
}

class Test2
{
	public Test2()
	{
		System.out.println("Test Class COnstructor invoked!!");
	}
}

public class ConstructorReferenceDemo {

	public static void main(String[] args) {
		
		//By Using lambda
		Callable c1 = () -> new Test2();
		c1.call();
		
		System.out.println();
		
		// By Using Method Reference
		Callable c2= Test2::new;
		c2.call();
		
	}

}
