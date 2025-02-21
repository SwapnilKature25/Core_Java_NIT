package com.nit.map.day3;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class RetrieveStudentObject {
	public static void main(String[] args) throws Exception {
		
		var fis=new FileInputStream("C:\\Users\\swapn\\SerializationDeserial\\student.txt");
		var ois=new ObjectInputStream(fis);
		
		try(fis; ois)
		{
			ArrayList<Student> lst = (ArrayList<Student>)ois.readObject();
			System.out.println(lst);
		}
		catch (Exception e) {
		
		e.printStackTrace();
		}
	}
}
