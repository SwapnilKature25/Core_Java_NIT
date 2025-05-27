package com.nit.inputoutputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadDatafromFile {
	public static void main(String[] args) throws IOException 
	{
		var fin = new FileInputStream("C:\\\\Users\\\\swapn\\\\FileStream\\\\test1.txt");

		try(fin)
		{
			int i = 0;
			
			while(true)
			{
				i = fin.read();  
				if(i==-1)
				{
					break;
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
