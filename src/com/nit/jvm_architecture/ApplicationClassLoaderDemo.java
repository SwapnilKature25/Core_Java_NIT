package com.nit.jvm_architecture;
/* WAP that describes Application class loader is responsible to 
load the user defined .class file

java.lang.Class class has provided a predefined non static method called getClassLoader(), the return type of this method 
is ClassLoader class.[Factory Method]

This method will provide the class loader name which is responsible to load the .class file into JVM Memory. */

class Customer
{
	
}

public class ApplicationClassLoaderDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Customer.class file will be loaded by :");
		System.out.println(Customer.class.getClassLoader());

	}

}
