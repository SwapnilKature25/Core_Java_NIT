package com.nit.map.day1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class HospitalFinder {
	public static void main(String[] args) {
		List<String> listOfTreatments1=Arrays.asList("Cardiac", "ENT", "Ortho", "Pediatric", "Gastro");

		Hospital h1=new Hospital("Aster",listOfTreatments1,"Mike","89789877","Ameerpet");
		Hospital h2=new Hospital("Prime",listOfTreatments1,"Jane","88789877","Begumpet");
		
		HospitalService hs=new HospitalService();
		int addHospital = hs.addHospital(h1);
		int addHospital2 = hs.addHospital(h2);
		//1
		System.out.println("Hospitals Available");
		System.out.println(hs.getHospitals().toString());
		System.out.println();
		
		//2
		Map<Integer, String> map = hs.getHospitals();
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + " "+val);
		}
		
		
		System.out.println();
		System.out.println("Hospital Details");
		System.out.println(hs.getHospitalDetails(102));
	}
}
