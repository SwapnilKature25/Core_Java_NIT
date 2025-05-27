package com.nit.streaminputoutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RetrieveEmployeeObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		var fin = new FileInputStream("C:\\\\Users\\\\swapn\\\\SerializationDeserial\\\\storeEmpObj.txt");
		var ois = new ObjectInputStream(fin);
		
		try(ois; fin)
		{
			 Employee emp = null;
			 
			 while((emp = (Employee)ois.readObject()) !=null)
			 {
				 System.out.println(emp);
			 }	
		}
		catch(java.io.EOFException e)
		{
			System.err.println("End of file is reached!!!!");
			
		}
	}
}
