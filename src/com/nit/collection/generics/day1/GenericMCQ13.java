package com.nit.collection.generics.day1;

class NareshIt22<T>
{
	public void nit(NareshIt22<?> it)
	{
		System.out.println(it);
	}

	@Override
	public String toString() {
		return "NareshIt22 []";
	}
	
}

public class GenericMCQ13{
	public static void main(String[] args) {		
		NareshIt22<String> str = new NareshIt22();
		str.nit(new NareshIt22());
//		str.nit("Naresh I Technologies");  
	}
}
