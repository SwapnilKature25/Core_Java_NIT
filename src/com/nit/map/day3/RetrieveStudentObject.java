package com.nit.map.day3;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class RetrieveStudentObject {
	public static void main(String[] args) throws Exception {
		
		var fis=new FileInputStream("C:\\Users\\swapn\\SerializationDeserial\\student.txt");
		var ois=new ObjectInputStream(fis);
		
		try(fis; ois)
		{
			Student stu=null;
			while((stu =(Student) ois.readObject()) !=null)
			{
				System.out.println(stu);
			}
		}
		catch (Exception e) {
		
		e.printStackTrace();
		}
	}
}
