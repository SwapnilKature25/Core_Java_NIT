package com.nit.jvm_architecture;

/*
WAP to describe that Platform class loader is the super class for 
application class loader.

getClassLoader() method return type is ClassLoader so further we can call any method of ClassLoader class, ClassLoader class
has provided a method called getParent() whose return type is again ClassLoader only.

public ClassLoader getParent();
*/

class Fooo
{
	
}

public class PlatformClassLoader 
{
	public static void main(String[] args) 
	{
		System.out.println("Super class of application class loader is :");
		System.out.println(Fooo.class.getClassLoader().getParent());
	}
}

/* Super class of application class loader is :
jdk.internal.loader.ClassLoaders$PlatformClassLoader@5a07e868 */


