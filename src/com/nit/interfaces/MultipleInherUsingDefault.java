package com.nit.interfaces;

interface Alpha11
{
	default void m1()
	{
		System.out.println("m1 method of Alpha interface");
	}
}
interface Beta11
{
	default void m1()
	{
		System.out.println("m1 method of Beta interface");
	}
}

class MI implements Alpha11, Beta11
{
//	Note : Here both the interfaces are having same method name m1() so, overridng is
//	compulsory in the implementer class otherwise we will get compilation error due 
//	to ambiguity issue.
	
	@Override
	public void m1() //Overriding is compulsory, otherwise 
//	                   we will get compilation error
	{
		Alpha11.super.m1();
		Beta11.super.m1();
		System.out.println("Multiple Inheritance is possible");
	}	
}
public class MultipleInherUsingDefault 
{
	public static void main(String[] args) 
	{
		MI m = new MI();
		m.m1();
	}

}


/* m1 method of Alpha interface
m1 method of Beta interface
Multiple Inheritance is possible
 */