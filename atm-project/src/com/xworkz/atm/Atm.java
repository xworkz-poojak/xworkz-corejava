package com.xworkz.atm;

import java.util.Date;

public class Atm {
       
	    private String name;
		private String place;
		private java.util.Date date;
		
		public Atm() {
			
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
		
		public java.util.Date getDate(){
			return date;
			
		}
		
		public void setDate(Date date){
			this.date=date;
			
		}
}
