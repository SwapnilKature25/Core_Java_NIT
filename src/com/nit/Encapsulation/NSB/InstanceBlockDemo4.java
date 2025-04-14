package com.nit.Encapsulation.NSB;

class Student
{
	public Student()
	{
		
		this(101,"Scott");
		System.out.println("No Argument Constructor");
	}
	
	public Student(int id, String name)
	{
		System.out.println("Parameterized Constructor");
	}
	
	{
		System.out.println("Object creation is in process");
	}
}


public class InstanceBlockDemo4 {

	public static void main(String[] args) 
	{
		new Student();
		System.out.println(".........");
		new Student();

	}

}
