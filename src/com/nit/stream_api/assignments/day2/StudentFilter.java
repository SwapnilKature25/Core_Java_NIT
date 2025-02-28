package com.nit.stream_api.assignments.day2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

record Student(String name,String course)
{
	
}

public class StudentFilter {
	public static void main(String[] args) {
		List<Student> students= Arrays.asList(
				new Student("Alice", "Java"),
				new Student("Bob", "ava"),
				new Student("Mike", "Java"));
			
	students.stream()
	.filter(std -> std.course()
	.contains("Java"))
	.forEach((res)->System.out.println(res.name()));
	}
}
