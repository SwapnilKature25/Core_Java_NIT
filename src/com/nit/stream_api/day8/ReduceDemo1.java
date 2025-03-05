package com.nit.stream_api.day8;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo1 {

	public static void main(String[] args) {
		Stream<Integer> integerStream = Stream.of(1,2,3,4,5);
		
		Optional<Integer> reduce = integerStream.reduce( (a,b)-> a+b );
//		Optional<Integer> reduce = integerStream.reduce(Integer::sum);
		reduce.ifPresent(System.out::println);  // 15

		
		Stream<Integer> prod = Stream.of(1,2,3,4,5);
		Integer reduce2 = prod.reduce(2, (a,b)-> a*b );
		System.out.println(reduce2);  //240
		
		
		integerStream = Stream.of(1, 2, 3, 4, 5);
        Integer sumWithIdentity = integerStream.reduce(2, Integer::sum);
        System.out.println(sumWithIdentity); 
	}

}
