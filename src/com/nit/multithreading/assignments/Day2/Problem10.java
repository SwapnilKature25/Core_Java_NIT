package com.nit.multithreading.assignments.Day2;

public class Problem10 {
	public static void main(String[] args) {
		new Problem10().go();
	}

	public void go() {
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("foo");
			}
		};
		Thread t = new Thread(r);
		t.start();
		t.run();
	}
}

//foo
//foo
