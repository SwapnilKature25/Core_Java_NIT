package com.nit.Encapsulation;


public class Test3
{
	Test3 t;
	int val;

	public Test3(int val)  
	{
		this.val = val;
	}

	public Test3(int val, Test3 t)
	{
		this.val = val;
		this.t = t;
	}

	public static void main(String[] args) 
	{
		Test3 t1 = new Test3(100);   //1000x
		
		Test3 t2 = new Test3(200,t1);  // 2000x(200, 1000x)

		Test3 t3 = new Test3(300,t1);  // 3000x(300, 1000x)

		Test3 t4 = new Test3(400,t2);  // 4000x (400, 2000x)

		t2.t = t3;    // 2000x  = 3000x
		t3.t = t4;   // 3000x = 4000x
		t1.t = t2.t;   // 1000x = 3000x
		t2.t = t4.t;   // 3000x = 4000x

	System.out.println(t1.t.val);  // 300
	System.out.println(t2.t.val);  // 400
	System.out.println(t3.t.val);  // 400
	System.out.println(t4.t.val);  //
	}
	
}  