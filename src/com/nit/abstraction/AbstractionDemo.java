package com.nit.abstraction;

//final abstract class Abstraction1 {     // The class Abstraction1 can be either abstract or final, not both
 abstract class Abstraction1 {
//	 private abstract void demo();   error
//	 static abstract void demo();	error
	 public abstract void demo1();
	 protected abstract void demo2();
}

public class AbstractionDemo
{
	public static void main(String[] args) {
//		Abstraction1 a=new Abstraction1();	we can't create object of Abstract class
	}
}

