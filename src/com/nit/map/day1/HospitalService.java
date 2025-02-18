package com.nit.map.day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HospitalService {
	ArrayList<Hospital> hospital=new ArrayList<>();
	private static int code=100;  
	
	public int addHospital(Hospital h)
	{
		code++;
		h.setHospitalCode(code);
		hospital.add(h);
		return code;
	}
	
	public Map<Integer,String> getHospitals()
	{
		HashMap<Integer,String> k=new HashMap<>();
		for(Hospital hs : hospital)
		{
			k.put(hs.getHospitalCode(), hs.getHospitalName());
		}
		
		return k;
	}
	
	public Hospital getHospitalDetails(int code)
	{
		for (Hospital hospital : hospital) {
			if(hospital.getHospitalCode() == code)
			{
				return hospital;
			}
		}
		return null;
	}
	
	
	
}
