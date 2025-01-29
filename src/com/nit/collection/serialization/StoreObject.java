package com.nit.collection.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class StoreObject implements Serializable{

	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		var fos=new FileOutputStream("C:\\file\\StudentData.txt");
		var oos=new ObjectOutputStream(fos);
		System.out.println("How many objects u want to create:");
		int n = sc.nextInt();
		try(sc;fos;oos)
		{
			for(int i=0;i<n;i++ )
			{
				Student s = Student.getStudentObject();
				oos.writeObject(s);
			}
			System.out.println("Data Successfully Submitted");

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
