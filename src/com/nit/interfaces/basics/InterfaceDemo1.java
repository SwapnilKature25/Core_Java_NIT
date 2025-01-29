package com.nit.interfaces.basics;

interface Arithmetic
{
	String name="I";
//	abstract void calculate(int x,int y);	// by default it has default access modifier
//	abstract static void calculate(int x,int y);  // abstract can't be static
	public abstract int calculate(int x,int y);
	default void m1()
	{
		System.out.println("Default method ");
	}
}
public class InterfaceDemo1 implements Arithmetic {
	  public static void main(String[] args) {
//		Arithmetic a=new Arithmetic();	//Cannot instantiate the type Arithmetic
		  InterfaceDemo1 i1=new InterfaceDemo1();
		  System.out.println(i1.calculate(23, 2));
		  System.out.println(name);
		  i1.m1();
	  }

	@Override
	public int calculate(int x, int y) {
		return x+y;
	}
	  
	
}
