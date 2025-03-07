package com.nit.stream_api.assignments.day6;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentManagement {

	private static List<Student> students = new ArrayList<>();
	
	
	private static void addStudent(Student std)
	{
		if(students.contains(std))
		{
			System.out.println("Students already present");
		}
		else {
			students.add(std);
			System.out.println("Student addedd successfully..");
		}
	}
	
	private static void  listAllStudents()
	{
		students.forEach(System.out::println);
	}
	
	private static void  sortStudentsByGpa()
	{
		if(students.isEmpty())
		{
			throw new NoSuchElementException("There are no students data present");
		}
		else {
			Stream<Student> sorted = students.stream().sorted((g1,g2)-> Double.compare(g1.getGpa(), g2.getGpa()));
			sorted.forEach(System.out::println);
		}
	}
	
	private static void findTopGpaByDepartment()
	{
		if(students.isEmpty())
		{
			throw new NoSuchElementException("There are no students data present");
		}
		else {
			students
			.stream()
			.collect(Collectors.toMap(Student::getDepartment,x->x, (x,y) -> )
		}
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}

}
