package com.nit.interfaces;
/*Program that describe that static method of an interface is only available 
 * to interface only that means we can access the static method of an interface 
 * by using only one way i.e interface name.

 * */

interface Alpha4
{
	static void m1()
	{
		System.out.println("Interface static method");
	}
}
class Beta3 implements Alpha4
{
}
public class StaticUnderInterface 
{
	public static void main(String[] args) 
	{
		Alpha4.m1();
		
//		Beta3.m1();  [Invalid]
		
		Beta3 b1 = new Beta3();
//		b1.m1(); //[Invalid]
	}
}

