package com.nit.stream_api.day8;

import java.util.Comparator;
import java.util.stream.Stream;
//find cheapest product
record Product(Integer pid, String pname, Double price)
{
	
}

public class MinDemo3 {
	public static void main(String[] args) {
		var p1 = new Product(111,"Camera",56000D);
		var p2 = new Product(333,"Watch",6000D);
		var p3 = new Product(222,"Keyboard",66000D);
		var p4 = new Product(555,"HeadPhone",46000D);
		
		Stream.of(p1,p2,p3,p4)
		.min(Comparator.comparingDouble(Product::price))
		.ifPresent(System.out::println);
		
	}
}
