package com.xworkz.satelite;

import java.util.Date;

public class Satelite {

		private String name;
		private int id;
		private java.util.Date date;
		
		public Satelite() {
			System.out.println("created");
		}
		
		
		public String getName(){
			return name;
		}

		public void setName(String name){
			this.name=name;
		}
		public int getId(){
			return id;
		}
		
		public void setId(int id){
			this.id=id;
		}
		
		public java.util.Date getDate(){
			return date;
			
		}
		
		public void setDate(Date date){
			this.date=date;
			
		}
	


}
