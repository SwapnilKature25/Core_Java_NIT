package com.nit.abstraction;

abstract class Alphas
{
	public abstract void show();
	public abstract void demo();
}

abstract class Betas extends Alphas
{
	@Override
	public void show()  // demo();
	{
		System.out.println("Show method implemented in Beta class");
	}
}

class Gamma extends Betas
{
	@Override
	public void demo() 
	{
		System.out.println("Demo method implemented in Gamma class");		
	}
	
}
public class AbstractDemoo3
{
	public static void main(String[] args) 
	{
		Gamma g = new Gamma();
		g.show(); g.demo();
		

	}

}