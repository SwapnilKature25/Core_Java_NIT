package com.nit.abstraction;

abstract class Shapess
{
	protected String shapeType;

	public Shapess(String shapeType) 
	{
		super();
		this.shapeType = shapeType;
	}
	
	public abstract void draw();	
}
class Rectangles extends Shapess
{
	public Rectangles(String shapeType) 
	{		
		super(shapeType);		
	}

	@Override
	public void draw()
	{
		System.out.println("Drawing "+shapeType);
	}
}
class Circless extends Shapess
{
	public Circless(String shapeType) 
	{
		super(shapeType);		
	}

	@Override
	public void draw() 
	{
		System.out.println("Drawing "+shapeType);		
	}
	
}
public class AbstractDemo3 {

	public static void main(String[] args) 
	{
		Shapess s = null;
		s = new Rectangles("Rectangle"); s.draw();
		s = new Circless("Circle"); s.draw();
	}

}