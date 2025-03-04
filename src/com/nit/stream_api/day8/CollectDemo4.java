package com.nit.stream_api.day8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Group all the employees based on the department

record Department(Integer deptId, String deptName)
{
	
}

record Employe(Integer empId, String empName,double salary,Department dept)
{
	
}

public class CollectDemo4 {

	public static void main(String[] args) {
		var e1 = new Employe(111, "Raj", 30000.34, new Department(1,"IT"));
		var e2 = new Employe(222, "Rahul", 40000.34, new Department(1,"IT"));
	
		var e3 = new Employe(333, "Scott", 35000.34, new Department(2,"Sales"));
		var e4 = new Employe(444, "Smith", 25000.34, new Department(2,"Sales"));

		var e5 = new Employe(555, "Virat", 45000.34, new Department(3,"HR"));
		var e6 = new Employe(666, "Rohit", 45000.34, new Department(3,"HR"));
		
		Map<Department, List<Employe>> collect = Stream.of(e1,e2,e3,e4,e5,e6)
		.collect(Collectors.groupingBy(Employe::dept));
		
//		collect.forEach( (k,v) -> System.out.println(k+" "+v));
		collect.entrySet().forEach(System.out::println);
		
	}

}
