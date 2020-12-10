package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.river.Kaveri;
import com.xworkz.xworkzapp.river.Ganga;

public class RiverUtil {
	public static void main(String[] args) {
		
	

	
	Ganga g=new Ganga();
	g.setBirthPlace("gangotri");
	g.setRiverType("long");
	g.setEndPlace("bayofbengle");
	System.out.println(g.getBirthPlace() + " " + g.getRiverType() + " " + g.getEndPlace());
	//System.out.println(g.getBirthplace() + " " + g.getRivertype() + " " + g.getEndplace());

  /* Kaveri k =new Kaveri();
	k.setBirthPlace("gangotri");
	k.setRiverType("long");
	k.setEndPlace("bayofbengle");
	System.out.println(k.getBirthPlace() + " " + k.getRiverType() + " " + k.getEndPlace())*/
	
}
}