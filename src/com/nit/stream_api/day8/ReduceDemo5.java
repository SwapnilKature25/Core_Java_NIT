package com.nit.stream_api.day8;

import java.util.stream.Stream;

//Finding the total sale amount 

record Sale(String items,double amount)
{
	
}

public class ReduceDemo5 {

	public static void main(String[] args) {
		
		Stream<Sale> sales = Stream.of(
				new Sale("Camera", 10000.0),
				new Sale("Mobile", 50000.0),
		        new Sale("Laptop", 80000.0),
		        new Sale("LED", 20000.0)
				);
		
		Double totalSale = sales.reduce(0.0, (sum, sale) -> sum + sale.amount(), Double::sum);
		System.out.println(totalSale); //160000
	}

}
