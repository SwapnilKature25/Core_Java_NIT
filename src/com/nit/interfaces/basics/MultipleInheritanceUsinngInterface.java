package com.nit.interfaces.basics;

/* Note:  static concrete methods are used in multiple inheritance
 * 		  default concrete methods are used in non-multiple inheritance
 *  */

interface Test1
{
	void m1();
	public static void m3()
	{
		System.out.println("interface test1 static method");
	}
	public default void m4()
	{
		System.out.println("interface test1 default method");
	}
}
interface Test2
{
	void m2();
	public static void m3()
	{
		System.out.println("interface test2 static method");
	}
//	we can't override default method in another interface
//	public default void m4()
//	{
//		System.out.println("interface test2 default method");
//	}
	
}

class Implementer implements Test1, Test2
{

	@Override
	public void m2() {
		System.out.println("Interface Test12 m2 implemented");
	}

	@Override
	public void m1() {
		System.out.println("Interface Test1 m1 implemented");
	}

	
}


public class MultipleInheritanceUsinngInterface {
	public static void main(String[] args) {
		Implementer i=new Implementer();
		i.m1();
		i.m2();
//		i.m3();	 we can't call static method of interface throught class object we have to call it through interface name
		Test1.m3(); 	// static method calling
		Test2.m3();
		i.m4();
		
	}
}
