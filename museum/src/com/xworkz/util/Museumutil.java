package com.xworkz.museum.util;

import com.xworkz.museum.Museum;

public class Museumutil {
	
	public static void main(String[] args) {
		
		Museum museum=new Museum(1, "RisingStar" , "MgRoad" , 5 ,"Science Department");
		System.out.println(museum.id +" "+museum.name+" "+museum.noOfFloors+" "+museum.department);
	}

}


