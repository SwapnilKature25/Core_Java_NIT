package com.nit.jvm_architecture;
// java.lang.ClassNotFoundException

class Student
{
	static 
	{
		System.out.println("static block executing at the time of class loading");
	}
	
	{
		System.out.println("Instance Block of Student class");
	}
}

public class LoadClassExplicitly {
	public static void main(String[] args) throws ClassNotFoundException {
		// If we want to load .class file explicitly
//		Class  : predefined class in java.lang.package
//		forName()  : it is a static method of class called Class.
		
		Class.forName("Student");
		
//		ClassNotFoundException  : It Occurs when we try load a class at runtime by using Class.forName() statement and the required class not found by JVM at runtime then JVM will generate ClassNotFoundException
//		NoClassDefFoundError   : It Occurs when the class was present at the time of compilation but at runtime the required .class file is not available then we will get NoClassDefFoundError.
	}
}
