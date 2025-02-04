package com.nit.jvm_architecture;

public class ConstructorInstance {

	static int i;
	int j;
	ConstructorInstance()
	{
		i=2;
		System.out.println("Default Constructor | static memeber value : "+ i);
	}
	
	{
		System.out.println("Instance Block | non static var value :"+j);
	}
	
	static {
		i=4;
		System.out.println(i);
		System.out.println("static block");
	}

	public static void main(String[] args) {
		ConstructorInstance c=new ConstructorInstance();
		ConstructorInstance d=new ConstructorInstance();
	}
}	
 
/*  Here static block will be executed once as the class loads only one time but we can create multiple objects so whenever we create object it will call instance and constructor block every time
4 
static block
Instance Block | non static var value :0
Default Constructor | static memeber value : 2
Instance Block | non static var value :0
Default Constructor | static memeber value : 2
 */