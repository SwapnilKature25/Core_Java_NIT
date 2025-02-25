package com.nit.collection.generics.day1;

import java.util.Arrays;
import java.util.List;

class NareshIt11
{
	public void nit(List<?> list)
	{
		for (Object li : list) {
			System.out.print(li+"  ");
		}
		System.out.println();
	}
}

public class GenericMCQ11{
	public static void main(String[] args) {
				
		NareshIt11 str = new NareshIt11();
		List<Integer> listInt = Arrays.asList(1001,252,36);
		List<String> liststr = Arrays.asList("Naresh","I","Technologies");
		
		str.nit(listInt);
		str.nit(liststr);
	}
}
