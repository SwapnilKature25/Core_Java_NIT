package com.nit.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingCharacter {

	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("C:\\Users\\swapn\\Stream Files\\fileWriter.txt");

		int i=0;
		while(true)
		{	    
		    i = fr.read();
		    if(i==-1)
		    {
		    	break;
		    }
		    System.out.print((char)i);
		}
	}

}