package com.nit.collection.list;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListDemo4
{ 
  public static void main(String[] args) throws IOException 
  {
	ArrayList<String> listOfIceCream = new ArrayList<>();
	listOfIceCream.add("Vanila");
	listOfIceCream.add("Strwbarry");
	listOfIceCream.add("Butter Scotch");
	
	//Serialization 
	var fout = new FileOutputStream("C:\\file\\IceCreamFlavors.txt");
	var oos = new ObjectOutputStream(fout);
	
	try(oos; fout)
	{
		oos.writeObject(listOfIceCream);
		System.out.println("Object Data stored Successfully!!!");		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	//De-Serializationprogr
	
	var fin = new FileInputStream("C:\\file\\IceCreamFlavors.txt");
	var ois = new ObjectInputStream(fin);
	
	try(ois; fin)
	{

		@SuppressWarnings("unchecked")
		ArrayList<String> list = (ArrayList<String>) ois.readObject();
	    list.forEach(System.out::println);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
  }       
}        