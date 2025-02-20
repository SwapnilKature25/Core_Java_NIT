package com.nit.map.day3;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable
{
	private  Integer studentId;
	private  String studentName;
	private  Double studentFees;
	private  String dateOfAdmission;
	
	public Student()
	{
		
	}
	public Student(Integer studentId, String studentName, Double studentFees, String dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}
	

	public static Student getStudentObject()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Id :");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Student Name :");
		String name=sc.nextLine();
		System.out.println("Enter Student Fees :");
		double fees=Double.parseDouble(sc.nextLine());
		System.out.println("Enter Student Date Of Admission :");
		String dob= sc.nextLine();
		
		return new Student(id,name,fees,dob);
		
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}
	
	
}
























/*

public class ArrayListDemo4
{ 
  public static void main(String[] args) throws IOException 
  {
	ArrayList<String> listOfIceCream = new ArrayList<>();
	listOfIceCream.add("Vanila");
	listOfIceCream.add("Strwbarry");
	listOfIceCream.add("Butter Scotch");
	
	//Serialization 
	var fout = new FileOutputStream("D:\\new\\IceCreamFlavors.txt");
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
	
	//De-Serialization
	
	var fin = new FileInputStream("D:\\new\\IceCreamFlavors.txt");
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

Note : In the above program, String and ArrayList both the classes implements from java.io.Serializable.
 */