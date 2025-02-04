package com.nit.jvm_architecture;

class Employee{}

class Student2{}

class Sample{}

public class ClassLoadingInformation 
{
	public static void main(String[] args) 
	{
		Class cls = Employee.class;
		System.out.println(cls.getName()); //FQN (Package name + class name)
		
		cls = Student2.class;
		System.out.println(cls.getName());
		
		cls = Sample.class;
		System.out.println(cls.getName());
		
	}

}