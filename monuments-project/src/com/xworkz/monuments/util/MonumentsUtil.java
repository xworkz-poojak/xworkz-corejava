package com.xworkz.monuments.util;

import java.util.Date;

import com.xworkz.monuments.Monuments;



public class MonumentsUtil {
	public static void main(String[] args) {
		Monuments monuments=new Monuments();
			
			monuments.setName("satelite");
			monuments.setPlace("mysore");
			monuments.setCode(2345);
			monuments.setDate(new Date());
			System.out.println(monuments.getCode() + " " + monuments.getDate() + " " + monuments.getName() );
			
			
			
		}


}
