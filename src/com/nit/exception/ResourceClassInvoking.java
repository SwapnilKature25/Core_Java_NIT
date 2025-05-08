package com.nit.exception;

import java.io.Closeable;
import java.io.IOException;

class DatabaseResourse implements  Closeable
{
	@Override
	public void close() throws IOException 
	{
		System.out.println("Database Resourse Closed!!!");
		
	}

}

 class FileResourse implements Closeable
{
	@Override
	public void close() throws IOException 
	{
		System.out.println("File Resourse Closed!!!");
		
	}

}
 

public class ResourceClassInvoking 
{
	public static void main(String[] args) throws Exception
	{
		DatabaseResourse dr = new DatabaseResourse();
		FileResourse fr = new FileResourse();
		
		try(dr;fr)
		{
		  System.out.println(10/0);	
		}
		catch(ArithmeticException e)
		{
			System.err.println("Divide by zero problem");
		}
		System.out.println("Main method Completed!!");
	}

}