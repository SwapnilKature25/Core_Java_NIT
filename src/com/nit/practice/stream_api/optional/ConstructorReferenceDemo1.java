package com.nit.practice.stream_api.optional;


@FunctionalInterface  
interface A 
{
    Test createObject();  
}

class Test 
{
    public Test()  
    {
        System.out.println("Test class Constructor invoked");
    }
}
public class ConstructorReferenceDemo1
{
    public static void main(String[] args) 
    {
        
    	//By using Lambda Expression
    	A a1 = () -> new Test();
    	a1.createObject();  // Test class Constructor invoked
    	
    	System.out.println(".........");
    	
    	//By using Method Reference 
    	A a2 = Test::new;
    	a2.createObject();  // Test class Constructor invoked
    	
    }
}