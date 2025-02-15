package com.nit.interfaces.day4;

import java.util.function.Function;

public class FunctionalInterface6{
	public static void main(String[] args) {
		Function<String, String> fun = str -> str.substring(2,5);
		System.out.println(fun.apply("Hyderabad"));  //der
	}
}




@FunctionalInterface
interface NIT5
{
	String myInterface(String a); //abstract method
	@Override
	String toString(); //Object class method
	
}