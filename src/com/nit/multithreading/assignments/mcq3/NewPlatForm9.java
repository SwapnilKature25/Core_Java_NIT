package com.nit.multithreading.assignments.mcq3;


class NewPlatForm9 extends Thread {
	public void run() {
		for (int i = 1; i < 3; i++) {
			try {
				Thread.sleep(2000);// two second
				System.out.println(i);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		NewPlatForm9 mt = new NewPlatForm9();
		mt.start();
	}
}