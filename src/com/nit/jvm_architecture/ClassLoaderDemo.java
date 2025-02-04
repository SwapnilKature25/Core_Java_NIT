package com.nit.jvm_architecture;

public class ClassLoaderDemo {
	public static void main(String[] args) {
		
		System.out.println(ClassLoaderDemo.class.getClassLoader());  //jdk.internal.loader.ClassLoaders$AppClassLoader@c387f44

	}
}
