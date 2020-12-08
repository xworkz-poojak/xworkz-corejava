package com.xworkz.atm.util;

import java.util.Date;

import com.xworkz.atm.Atm;

public class AtmUtil {
	
	public static void main(String[] args) {
		Atm atm=new Atm();
			
			atm.setName("BOI");
			atm.setPlace("mysore");
			atm.setDate(new Date());
			System.out.println(  atm.getDate() + " " + atm.getName() + " "+ atm.getPlace() );
			
			
			
		}

}
