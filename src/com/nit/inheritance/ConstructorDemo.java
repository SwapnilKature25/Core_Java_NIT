package com.nit.inheritance;

class Alpha2
{
	public Alpha2()
	{
		System.out.println("Alpha class Constructor!!!");  //1
	}
}
class Beta2 extends Alpha2
{}  								// 2   --- default constructor added by compiler

class Gamma extends Beta2
{
	public Gamma()
	{
		System.out.println("Gamma class Constructor!!!");   // 3
	}
}

public class ConstructorDemo {

	public static void main(String[] args) 
	{
		new Gamma();
	}

}
