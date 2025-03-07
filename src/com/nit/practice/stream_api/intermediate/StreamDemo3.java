package com.nit.practice.stream_api.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

record Player(Integer id, String name) 
{
	
}

public class StreamDemo3
{ 
	public static void main(String args[])
	{
		//Get the name of the Player in upper-case from Player Object
		  
		 List<Player> playerList = createPlayerList();
		 
		List<String> playerName = playerList.stream().map(str -> str.name().toUpperCase()).collect(Collectors.toList());
		System.out.println(playerName);
		
		
		System.out.println();
		
		List<Player> list = playerList.stream().sorted((i1,i2) -> i1.id().compareTo(i2.id())).collect(Collectors.toList());
		list.forEach(System.out::println);
	}	
	
	public static List<Player> createPlayerList()
	{
		List<Player> al = new ArrayList<>();
		al.add(new Player(18, "Virat"));
		al.add(new Player(45, "Rohit"));
		al.add(new Player(7, "Dhoni"));
		al.add(new Player(18, "Virat"));
		al.add(new Player(90, "Bumrah"));
		al.add(new Player(67, "Hardik"));
		
		return al;
	}
}

 