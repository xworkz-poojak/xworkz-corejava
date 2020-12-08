package com.xworkz.monuments;

import java.util.Date;

public class Monuments {
	

	private String name;
	private String place;
	private int code;
	private java.util.Date date;
	
	public Monuments() {
		
	}
	
	
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name=name;
	}
	
	public String getPlace(){
		return place;
	}

	public void setPlace(String place){
		this.place=place;
	}
	public int getCode(){
		return code;
	}
	
	public void setCode(int code){
		this.code=code;
	}
	
	public java.util.Date getDate(){
		return date;
		
	}
	
	public void setDate(Date date){
		this.date=date;
		
	}



}
