package com.nit.stream_api.day7;

@FunctionalInterface
interface TriFunction<T,U,V,R>
{
	R myApply(T t,U u,V v);
}

class Addition
{
	public Integer sum(String x, String y)
	{
		return Integer.parseInt(x)+ Integer.parseInt(y);
	}
}

public class ArbitaryRefDemo3 {
	public static void main(String[] args) {
		
		//Lambda
		TriFunction<Addition,String,String,Integer> fn1 =
				(addition,str1,str2) -> addition.sum(str1, str2);
		Integer result = fn1.myApply(new Addition(), "100", "200");
		System.out.println("Sum is  : "+result);
		
		System.out.println("***************");
		
		//Method Refernce
		TriFunction<Addition,String,String,Integer> fn2 = Addition::sum;
		Integer res = fn2.myApply(new Addition(), "125", "125");
		System.out.println("Sum is : "+res);
		
/* Sum is  : 300
***************
Sum is : 250 */
		
		
	}
}
