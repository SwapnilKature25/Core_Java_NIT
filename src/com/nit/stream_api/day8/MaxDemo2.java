package com.nit.stream_api.day8;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// Emp with highest salary

record Employees(Integer eid, String ename, Double esalary)
{
	
}

public class MaxDemo2 {

	public static void main(String[] args) {
		Employees e1 = new Employees(111,"Alen",67000d);
		Employees e2 = new Employees(222,"Mike",77000d);
		Employees e3 = new Employees(444,"Martin",87000d);
		Employees e4 = new Employees(333,"Jane",47000d);
		
		Optional<Employees> max = List.of(e1,e2,e3,e4).stream()
		.max(Comparator.comparingDouble(Employees::esalary));
	
		max.ifPresent(System.out::println);
	}

}
