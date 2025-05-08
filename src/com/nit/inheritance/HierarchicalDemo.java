package com.nit.inheritance;

import java.text.DecimalFormat;
import java.util.Scanner;

class Shape
{
	protected int x;
	
	public Shape(int x)
	{
	  this.x = x;
	  System.out.println("x value is :"+x);
	}
}
class Circle extends Shape
{	
	final double PI = 3.14;
	
	public Circle(int radius)
	{
		super(radius);
	}
	
	public void areaOfCircle()
	{
		double area = PI * x * x;
		
		DecimalFormat df = new DecimalFormat("000.000");
		System.out.println("Area of Circle is :"+df.format(area));
	}	
}

class Rectangle extends Shape
{
	 protected int breadth;
	 
	 public Rectangle(int length, int breadth)
	 {
		super(length); 
		this.breadth = breadth;
	 }
	 
	 public void areaOfRectangle()
	 {
		 double area = super.x * this.breadth;
		 System.out.println("Area of Rectangle is :"+area);
	 }
}

public class HierarchicalDemo {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of Circle :");
		int radius = sc.nextInt();
		
		Circle circle = new Circle(radius);
		circle.areaOfCircle();
		
		System.out.print("Enter the length of the Rectangle :");
		int length = sc.nextInt();
		System.out.print("Enter the breadth of the Rectangle :");
		int breadth = sc.nextInt();
		
		Rectangle rectangle = new Rectangle(length, breadth);
		rectangle.areaOfRectangle();
		
		sc.close();

	}

}