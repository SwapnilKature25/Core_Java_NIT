package com.nit.collection.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class RetrieveObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		var fis=new FileInputStream("C:\\file\\StudentData.txt");
		var ois=new ObjectInputStream(fis);
		Student s = null;
		try(fis;ois)
		{
			
		while((s=(Student)ois.readObject())!=null)
		System.out.println(s);
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
}
