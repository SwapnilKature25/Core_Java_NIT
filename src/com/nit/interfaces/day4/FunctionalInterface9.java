package com.nit.interfaces.day4;


@FunctionalInterface
interface NIT6
{	
	int myInterface(int a);
}

@FunctionalInterface
interface NewInterface
{
	void alpha(String a);
}

public class FunctionalInterface9 {
	public static void main(String[] args) {
		NIT6 nit = (a) -> a*a*a;
		System.out.println(nit.myInterface(5));
		NewInterface result = (a) -> System.out.println("Welcome to NareshIT");
		result.alpha("");
	}
}
