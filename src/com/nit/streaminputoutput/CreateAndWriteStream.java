package com.nit.streaminputoutput;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateAndWriteStream {

	public static void main(String[] args) throws IOException 
	{
		var fos = new FileOutputStream("C:\\Users\\swapn\\Stream Files\\output.txt");
		
		try(fos)
		{
			String str = "Hyderabad is an IT city";			
			byte[] byteData = str.getBytes();
			
			fos.write(byteData);
			
			System.out.println("Data stroed successfully!!!");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
