package com.nit.interfaces.day4;

import java.util.function.Consumer;

public class FunctionalInterface10 {
	public static void main(String[] args) {
		Consumer<String> value = (a) -> System.out.println("Naresh I Technologies");
		value.accept("");
		
		Consumer<Integer> value2 = (a) -> System.out.println(a*3);
		value2.accept(5);

		Consumer<String> value3 = (a) -> System.out.println(a.toLowerCase());
		value3.accept("NareshIT");

	}

}
