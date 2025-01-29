package com.nit.multithreading.assignments.Day2;


public class Problem5 extends Thread {

    public static void main(String[] args) throws Exception {
    Problem5 t = new Problem5();
    t.start();
    t.method();
    }

    public void run() {
    
    System.out.println("run");
    }

    public void method() {
	hello();
    System.out.println("method");
    }

    public void hello()
	{
	hello1();
	System.out.println("PR");
	}

	public void hello1()
	{
	
	System.out.println("RR");
	}
}

/*  RR PR method run   => run will execute lastly because main thread will not wait for start() */
