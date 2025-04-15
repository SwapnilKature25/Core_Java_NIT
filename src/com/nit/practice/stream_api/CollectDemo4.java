package com.nit.practice.stream_api;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record Department(Integer deptId, String deptName)
{	
}



record Employe(Integer empId, String empName, double salary, Department dept)
{
	//111 , "A", 23890.89, new Department(1,"IT");
}



public class CollectDemo4 
{
	public static void main(String[] args) 
	{
		Employe e1 = new Employe(111, "Raj", 23789.89, new Department(1, "IT"));
		Employe e2 = new Employe(222, "Rahul", 23789.89, new Department(1, "IT"));
		Employe e3 = new Employe(333, "Scott", 23789.89, new Department(2, "Sales"));
		Employe e4 = new Employe(444, "Smith", 23789.89, new Department(2, "Sales"));
		Employe e5 = new Employe(333, "Virat", 23789.89, new Department(3, "HR"));
		Employe e6 = new Employe(444, "Rohit", 23789.89, new Department(3, "HR"));
			
		
		Stream<Employe> streamOfEmp = Stream.of(e1,e2,e3,e4,e5,e6);		
		
		Map<Department, List<Employe>> deptWiseEmp = streamOfEmp.collect(Collectors.groupingBy(Employe::dept));
		
		deptWiseEmp.forEach((dep, emps)-> System.out.println(dep+" : "+emps));
		
	}

}