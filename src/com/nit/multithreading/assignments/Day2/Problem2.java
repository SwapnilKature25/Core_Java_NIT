package com.nit.multithreading.assignments.Day2;

public class Problem2 extends Thread 
{
static String name = "ravi";

public static void main(String args[]) 
{
Problem2 t = new Problem2();
t.Problem2(name);
System.out.print(" " + name);
}

public void Problem2(String name) {
start();
System.out.print(" method");
}

public void run() {
System.out.print(" run");
}
}

/*  method run ravi */