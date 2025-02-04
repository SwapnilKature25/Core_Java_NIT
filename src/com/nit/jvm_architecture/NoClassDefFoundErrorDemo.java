package com.nit.jvm_architecture;
//NoClassDefFoundErrorDemo :  it occurs when the class was present at the time of compilation but at runtime the required .class file is not available(manually deleted by user).

class Students
{
	public void learner()
	{
		System.out.println("Hello Learner");
	}
}

public class NoClassDefFoundErrorDemo {
	public static void main(String[] args) {
		Students s=new Students();
		s.learner();
	}
}
