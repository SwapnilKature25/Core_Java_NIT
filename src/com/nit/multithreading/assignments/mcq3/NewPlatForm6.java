package com.nit.multithreading.assignments.mcq3;

//class TickTock extends Thread  => 2nd way using Thread instead of Passing Runnable target to the Thread constructor
class TickTock  extends Thread{
	int count;
	public synchronized void increment()
	{
		count++;
	}
}
class NewPlatForm6 {
	public static void main(String[] args) throws Exception
	{
		TickTock tt = new TickTock();
		Thread t1 = new Thread(new TickTock() {
			public void run()
			{
				for (int i = 0; i < 100000; i++) {
					tt.increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run()
			{
				for (int i = 0; i < 100000; i++) {
					tt.increment();
				}
			}
		});
        t1.start();
		t2.start();
		t1.join();
//		t2.join();  if we call join() on t1 ,However, since t2 might still be executing, the printed value of count could be less than 200000.
		System.out.println("Count : " + tt.count);
	}
}