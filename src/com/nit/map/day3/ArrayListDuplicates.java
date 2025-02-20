package com.nit.map.day3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDuplicates {
	List<Integer> numlst=new ArrayList<>();

	public ArrayListDuplicates()
	{
		
	}
	
	public ArrayListDuplicates(List<Integer> numlst) {
		super();
		this.numlst = numlst;
	}

	public List<Integer> getNumlst() {
		return numlst;
	}

	public void setNumlst(List<Integer> numlst) {
		this.numlst = numlst;
	}
	
	public void getDuplicateList(List num)
	{
		for(int i=0; i<numlst.size(); i++)
		{
			if(numlst[i]==numlst[i+1])
			{
				
			}
		}
	}
	
}
