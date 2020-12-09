package com.xworkz.util;

import com.xworkz.newspaper.Prajavani;

public class NewsPaperUtil {
	public static void main(String[] args) {
		Prajavani prajavani = new Prajavani("politics","nature",15);
		//prajavani.information="abcd ";
		//prajavani.articals="sdg ";
		//prajavani.noOfPages=20;
		//System.out.println(prajavani.information + " " + prajavani.articals + " " + prajavani.noOfPages);
	
	 System.out.println(prajavani.getInformation()+ " " + prajavani.getArticals()+ " " + prajavani.noOfPages);
	}

}
