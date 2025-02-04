package com.nit.jvm_architecture;

//Program to show Bootstarp class loader

class Foo2 {

}

public class PlatformClassLoaderDemo {
	public static void main(String[] args) {
		System.out.println("Super class of platform class loader is :");
		System.out.println(Foo2.class.getClassLoader().getParent().getParent());
//									  Application loader . Platform Loader . Bootstrap loader
	}
}