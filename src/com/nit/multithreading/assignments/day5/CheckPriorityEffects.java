package com.nit.multithreading.assignments.day5;

public class CheckPriorityEffects {
	public static void main(String[] args) {
		
		LowPriority l=new LowPriority();
		NormalPriority n=new NormalPriority();
		HighPriority h=new HighPriority();
		
		l.start();
		n.start();
		h.start();
		
	}
}
