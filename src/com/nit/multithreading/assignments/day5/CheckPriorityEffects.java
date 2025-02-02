package com.nit.multithreading.assignments.day5;

public class CheckPriorityEffects {
	public static void main(String[] args) {
		
		LowPriority l=new LowPriority();
		NormalPriority n=new NormalPriority();
		HighPriority h=new HighPriority();
		l.setPriority(Thread.MIN_PRIORITY);
		n.setPriority(Thread.NORM_PRIORITY);
		h.setPriority(Thread.MAX_PRIORITY);
		
		
		l.setName("lowPriority");
		n.setName("normalPriority");
		h.setName("highPriority");
		;
		l.start();
		n.start();
		h.start();
		
	}
}

/* highPriority - Priority: 10
normalPriority - Priority: 5
lowPriority - Priority: 1
highPriority - Priority: 10
highPriority - Priority: 10
highPriority - Priority: 10
highPriority - Priority: 10
normalPriority - Priority: 5
normalPriority - Priority: 5
lowPriority - Priority: 1
normalPriority - Priority: 5
lowPriority - Priority: 1
normalPriority - Priority: 5
lowPriority - Priority: 1
lowPriority - Priority: 1
 */