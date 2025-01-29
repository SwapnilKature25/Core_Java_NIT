package com.nit.interfaces;

interface Alpha
{
	void m1();
}
interface Beta2
{
	void m1();
}

class Implementer implements Alpha, Beta2
{	
	@Override
	public void m1() 
	{
		System.out.println("MI is possible");		
	}	
}



public class MultipleInheritanceUsingInterface
{
	public static void main(String[] args) 
	{
		Implementer i = new Implementer();
		i.m1();

	}

}