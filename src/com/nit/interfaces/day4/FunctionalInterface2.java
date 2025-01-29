package com.nit.interfaces.day4;

interface Addition
{
//	int add(int b);
	int methodStr(String str);

//	int add(int a, int b);
}
public class FunctionalInterface2 {
	public static void main(String[] args) {
		int a = 21;
//		Addition add = b -> b+b;		// CE : The target type of this expression must be a functional interface
//		Addition str= str -> "2";	// Type mismatch: cannot convert from String to int
//		System.out.println(add.add(a));
	}
}