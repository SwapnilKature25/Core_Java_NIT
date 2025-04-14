package com.nit.polymorphism;

class Calculate
{
	 public Calculate()
	 {
		 this(10,20);
	 }
	 public Calculate(int x, int y)
	 {
		 this(100,200,300);
		 System.out.println("Sum of two integer is :"+(x+y));
	 }
	 public Calculate(int x, int y, int z)
	 {
		 System.out.println("Sum of three integer is :"+(x+y+z));
	 }
}

public class ConstructorOverloading {

	public static void main(String[] args) 
	{
		new Calculate();
	}

}