package com.nit.interfaces.day4;

interface NIT4
{
	public int myInterface(int a);
}

public class FunctionalInterface8 {
	public static void main(String[] args) {
		NIT4 nit = (a) -> a+1;
		int i = nit.myInterface(6);
		System.out.println(i);  //7
	}
}