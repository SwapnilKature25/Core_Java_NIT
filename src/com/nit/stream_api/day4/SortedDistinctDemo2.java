package com.nit.stream_api.day4;

import java.util.stream.Stream;

record Products(Integer id,String name, Double price)
{
	
}

public class SortedDistinctDemo2 {
	public static void main(String[] args) {
		Products p1=new Products(333,"D",67000D);
		Products p2=new Products(111,"E",77000D);
		Products p3=new Products(555,"A",57000D);
		Products p4=new Products(222,"C",87000D);
		
		Stream.of(p1,p2,p3,p4).distinct().sorted((prod1,prod2) -> Double.compare(prod1.price(),prod2.price())).forEach(System.out::println);
	}
}
