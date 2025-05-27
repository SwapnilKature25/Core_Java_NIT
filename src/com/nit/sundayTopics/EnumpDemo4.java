package com.nit.sundayTopics;

//Interview Question
//class Hello
//{
//	int x = 100;
//}
//
//enum Direction extends Hello
//{
//	EAST, WEST, NORTH, SOUTH;
//
//}

public class EnumpDemo4 
{
	
	enum Season   
	{
	SPRING, SUMMER, WINTER, FALL, RAINY
	}

	public static void main(String[] args) 
	{
		Season[] seasons = Season.values();
		
		for(Season season : seasons)
		{
			System.out.println(season.name()+" order position is :"+season.ordinal());
		}
	}

		
	}