package com.nit.practice.stream_api;

  
import java.util.function.*;
public class BinaryOperatorDemo  
{
	public static void main(String[] args) 
	{
		BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(3, 5));  
	}
}