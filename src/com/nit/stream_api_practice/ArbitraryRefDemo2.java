package com.nit.stream_api_practice;

import java.util.Arrays;

class Persons
{
    String name;
    
    public Persons(String name)
    {
        this.name = name;
    }

    public int personInstanceMethod1(Persons person)  
    {
        return  this.name.compareTo(person.name); 
    }

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}  
    
    
}

public class ArbitraryRefDemo2 
{
    public static void main (String[] args) throws Exception
    {
    	
        Persons[] personArray = {new Persons("Zuber"),new Persons("Raj"), new Persons("Ankit"), new Persons("Abhishek")}; 
        
        Arrays.sort(personArray, Persons::personInstanceMethod1);
    
        System.out.println(Arrays.toString(personArray));
    }
}