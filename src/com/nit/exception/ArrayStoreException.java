package com.nit.exception;

import java.util.Arrays;

public class ArrayStoreException {

	public static void main(String[] args) 
	{
		Object []obj = new String[3]; //valid with Array
		obj[0] = "Ravi";
		obj[1] = "hyd";
		obj[2] =  67.90; //java.lang.ArrayStoreException
		
		System.out.println(Arrays.toString(obj));

	}

}