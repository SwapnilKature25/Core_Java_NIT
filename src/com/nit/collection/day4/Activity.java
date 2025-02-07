package com.nit.collection.day4;

public class Activity {
	String name;
	String schedule;
	
	public Activity(String name,String schedule)
	{
		this.name=name;
		this.schedule=schedule;
	}

	public String getName() {
		return name;
	}

	public String getSchedule() {
		return schedule;
	}

	@Override
	public String toString() {
		return "Activity [name=" + name + ", schedule=" + schedule + "]";
	}

}
