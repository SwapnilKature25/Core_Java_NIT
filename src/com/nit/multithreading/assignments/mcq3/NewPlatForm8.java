package com.nit.multithreading.assignments.mcq3;

import java.io.IOException;

class MyThread1 extends Thread {
	public boolean stop = true;

	public void run() {
		for (int i = 1; i < 3; i++) {
			System.out.println(i);
			if (stop == false) {
				return;
			}
		}
	}
}

class NewPlatForm8 {
	public static void main(String args[]) throws IOException {
		MyThread1 mt = new MyThread1();
		mt.start();
		System.out.print("Press Enter to Stop Thread :\n");
		System.in.read();
		mt.stop = false;
	}
}




