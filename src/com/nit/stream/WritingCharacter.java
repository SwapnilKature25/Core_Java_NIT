package com.nit.stream;

import java.io.FileWriter;
import java.io.IOException;

public class WritingCharacter {

	public static void main(String[] args) throws IOException 
	{
		FileWriter fw = new FileWriter("C:\\Users\\swapn\\Stream Files\\fileWriter.txt");

		try(fw)
		{
			String str = "An insitute in Ameerpet and KBHP";
				
			fw.write(str);
			
			System.out.println("Data Stored");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}