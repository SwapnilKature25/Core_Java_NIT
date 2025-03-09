package com.nit.practice.stream_api.optional;

import java.util.Optional;

public class OptionDemo1 {

	public static void main(String[] args) 
	{
		String str = "Java";  
		Optional<String> cont = Optional.ofNullable(str);	
		
		//orElse method
	    String val = cont.orElse("No value in the container by orElse");
	    System.out.println(val);
	    
	    System.out.println(".............");
	    
	    if(cont.isPresent())
	    {
	    	String value = cont.get();
	    	System.out.println("Value in the container : "+value);
	    }
	    else {
	    	System.out.println("No Value is there in container  ");	    	
	    }
		
	}

}
