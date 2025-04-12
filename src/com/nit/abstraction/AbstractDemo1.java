package com.nit.abstraction;

abstract class Shapes  
{
	public abstract void draw();
}

class Square extends Shapes
{
	@Override
	public void draw()
	{
		System.out.println("Drawing Square");
	}
		
}
class Circles extends Shapes
{
	@Override
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
		
}

public class AbstractDemo1 
{
	public static void main(String[] args) 
	{
	   Shapes s1 = null;
	   s1 = new Circles(); s1.draw();
	   s1 = new Square(); s1.draw();   

	}
}
