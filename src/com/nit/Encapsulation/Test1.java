package com.nit.Encapsulation;

class Test1
{
int x;  
int y;  

void m1(Test1 t)  //t -> 2000x
{
	x=x+1;
	y=y+2;
	t.x=t.x+3;
	t.y=t.y+4;
}
public static void main(String[] args)
{
Test1 t1=new Test1(); //x , y , m1() 
Test1 t2=new Test1(); //x , y , m1()  

t1.m1(t2);

System.out.println(t1.x+"... "+t1.y); 
System.out.println(t2.x+"... "+t2.y);	 

t2.m1(t1);
System.out.println(t1.x+"... "+t1.y);
System.out.println(t2.x+"... "+t2.y);

t1.m1(t1);
System.out.println(t1.x+"... "+t1.y);
System.out.println(t2.x+"... "+t2.y);

t2.m1(t2);
System.out.println(t1.x+"... "+t1.y);
System.out.println(t2.x+"... "+t2.y);  
}
}