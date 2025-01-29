package com.nit.abstraction;

//Program that describes how to initialize super class properties :

abstract class Shape
{
	protected String shapeType;

	public Shape(String shapeType) 
	{
		super();
		this.shapeType = shapeType;
	}
	
	public abstract void draw();	
}
class Rectangle extends Shape
{
	public Rectangle(String shapeType) 
	{		
		super(shapeType);		
	}

	@Override
	public void draw()
	{
		System.out.println("Drawing "+shapeType);
	}
}
class Circle extends Shape
{
	public Circle(String shapeType) 
	{
		super(shapeType);		
	}

	@Override
	public void draw() 
	{
		System.out.println("Drawing "+shapeType);		
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) 
	{
		Shape s = null;
		s = new Rectangle("Rectangle"); s.draw();
		s = new Circle("Circle"); s.draw();
	}

}