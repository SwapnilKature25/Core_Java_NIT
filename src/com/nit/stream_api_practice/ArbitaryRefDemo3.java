package com.nit.stream_api_practice;


@FunctionalInterface
interface MyInterface<T,U,V,R>
{
	R myApply(T t, U u, V v);
}

class Addition
{
	public Integer doSum(String x, String y)
	{
		return Integer.parseInt(x) + Integer.parseInt(y);
	}
}

public class ArbitaryRefDemo3 
{
	public static void main(String[] args) 
	{
    //By Using Lambda expression
	MyInterface<Addition,String,String,Integer> fn1 = (a, t, v) -> a.doSum(t, v);	
	Integer result = fn1.myApply(new Addition(), "100", "200");
	System.out.println("Result is :"+result);
	
	//By Using Method Reference
	
    	MyInterface<Addition,String,String,Integer> fn2= Addition::doSum;
    	Integer myApply = fn2.myApply(new Addition(), "100", "200");
    	System.out.println("Result is : "+myApply);
	}

}