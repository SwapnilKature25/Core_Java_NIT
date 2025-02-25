package com.nit.stream_api.day1;

import java.util.ArrayList;
import java.util.List;

//WAP to retrieve all the employee records whose salary is greater than 50k and convert into list

record Employee(Integer id,String name,Double salary)
{
	
}

public class StreamToCollection3 {
	public static void main(String[] args) {
		ArrayList<Employee> listOfEmployee= new ArrayList<>();
		listOfEmployee.add(new Employee(222,"Scott",40000D));
		listOfEmployee.add(new Employee(333,"Smith",50000D));
		listOfEmployee.add(new Employee(111,"Martin",70000D));
		listOfEmployee.add(new Employee(444,"Alen",60000D));
		
		List<Employee> list = listOfEmployee.stream().filter(emp -> emp.salary() > 50000 ).toList();
		list.forEach(System.out::println);
	}
}
