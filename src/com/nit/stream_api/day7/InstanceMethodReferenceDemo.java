package com.nit.stream_api.day7;

@FunctionalInterface
interface Trainer
{
	void getTraining(String name,int exprience);
}

class InstanceMethod
{
	public void getTraining(String name,int experience)
	{
		System.out.println("Trainer name is : "+name+" having "+ experience+" years of experience.");
	}
}

public class InstanceMethodReferenceDemo {
	public static void main(String[] args) {
		
		//Using Lambda Experience
		Trainer t1 = (name, exp) -> 
		System.out.println("Trainer name is  :"+ name 
				+" and total experience is : "+ exp+" years");
		t1.getTraining("Scott", 5);
		
		
		//Using Method Reference
		Trainer t2 = new InstanceMethod()::getTraining;
		t2.getTraining("Mike", 10);
		
	}
}
