package com.nit.stream;

//Program to read the data from the File :

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromFile {

	public static void main(String[] args) throws IOException 
	{
		var fin = new FileInputStream("C:\\Users\\swapn\\Stream Files\\output.txt");

		try(fin)
		{
			int i = 0;
			
			while(true)
			{
				i= fin.read();
				if(i==-1)
				{
					break;  // EOF - End Of File
				}
				System.out.print((char)i);
			}		
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}