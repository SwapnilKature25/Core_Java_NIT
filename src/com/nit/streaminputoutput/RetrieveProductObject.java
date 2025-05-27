package com.nit.streaminputoutput;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.nit.assignments.exception.Product;

public class RetrieveProductObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		var fin = new FileInputStream("C:\\\\Users\\\\swapn\\\\SerializationDeserial\\\\StoreProdObj.txt");
		var ois = new ObjectInputStream(fin);
		
		try(ois; fin)
		{
			Product prod = null;
			
			while((prod = (Product)ois.readObject()) !=null)
			{
				System.out.println(prod);
			}			
			
		}
		catch(EOFException e)
		{
			System.err.println("End of file has reached");
		}
		
	}

}