package com.nit.collection.list;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

record Employee(Integer employeeId, String employeeName) implements Serializable
{	
}


public class ArrayListSerialization 
{	
	public static void main(String[] args) throws IOException 
	{
		ArrayList<Employee> listOfEmployees = new ArrayList<>();
		listOfEmployees.add(new Employee(111, "A"));
		listOfEmployees.add(new Employee(222, "B"));
		listOfEmployees.add(new Employee(333, "C"));
		listOfEmployees.add(new Employee(444, "D"));
		listOfEmployees.add(new Employee(555, "E"));
		
		String fpath="C:\\file\\EmployeeData.txt";
		
		// Serialization
		
		var fos=new FileOutputStream(fpath);
		var oos=new ObjectOutputStream(fos);		
		
		try(fos;oos)
		{
			oos.writeObject(listOfEmployees);
			System.out.println("Employee Data stored successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		// De-serialization
		
		var fis=new FileInputStream(fpath);
		var ois=new ObjectInputStream(fis);
		
		try(fis; ois)
		{
			ArrayList<Employee> emp = (ArrayList<Employee>) ois.readObject();
			emp.forEach(System.out::println);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}
}
