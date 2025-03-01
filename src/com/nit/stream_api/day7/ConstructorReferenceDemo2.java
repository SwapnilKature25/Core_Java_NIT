package com.nit.stream_api.day7;

import java.util.function.Supplier;

class Student
{
	public Student()
	{
		System.out.println("Student class Contructor");
	}
	
	public void m1()
	{
		System.out.println("M1 non static method");
	}
}

public class ConstructorReferenceDemo2 {
	public static void main(String[] args) {
		Supplier<Student> s1= Student::new;
		Student obj=s1.get();
		obj.m1();
	}
}
