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
	
	public void getDuplicateList(int[] num)
	{
		for(int i=0; i<num.length; i++)
		{
			int count=0;
			for(int j=1; j<num.length; j++)
			{
				if(num[i] == num[j])
				{
					count++;
					if(count >=2)
					{
						this.getNumlst().add(num[i]);
					}
				}
			}
		}
		System.out.println(getNumlst());
	}
	
	
	public static void main(String[] args) {
		int arr[] = {11,23,11,23,45,67,11};
		ArrayListDuplicates a=new ArrayListDuplicates(arr);
		
		
	}
	
	
	
}
