package com.nit.interfaces.day4;

@FunctionalInterface
interface Add
{
	int add(int b);
}
public class FunctionalInterface1 {
	
	public static void main(String[] args)
	{
		int a = 10;
		
		Add add = (int b) -> b;
//		Cube cube = b -> b*b*b;

		System.out.println(add.add(a));
	}
}
