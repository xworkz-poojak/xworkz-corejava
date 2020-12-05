package com.xworkz.museum;

public class Museum {
	//instance members
	public int id;
	public String name;
	public String address;
	public int noOfFloors;
	public String department;
	
	public  Museum() {
		System.out.println("museum const without args");
		
	}
	
	
	//parametarised constructor
public	Museum(int id ,String name , String address, int noOfFloors ,String department) {
		System.out.println("museum const with args");
		
		this.id=id; //this is used to point instance variable
		this.name=name;
		this.address=address;
		this.noOfFloors=noOfFloors;
		this.department=department;
		
		
		
	}
	

}
