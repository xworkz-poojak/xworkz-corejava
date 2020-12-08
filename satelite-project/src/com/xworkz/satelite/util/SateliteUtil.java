package com.xworkz.satelite.util;

import java.util.Date;

import com.xworkz.satelite.Satelite;



public class SateliteUtil {
	public static void main(String[] args) {
	Satelite satelite=new Satelite();
		//rocket.date=new Date();
		satelite.setName("plsv");
		satelite.setId(2345);
		satelite.setDate(new Date());
		System.out.println(satelite.getId() + " " + satelite.getDate() + " " + satelite.getName());
		
		
		
	}

}
