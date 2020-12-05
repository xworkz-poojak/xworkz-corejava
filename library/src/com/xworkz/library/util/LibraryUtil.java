package com.xworkz.library.util;

import com.xworkz.library.Library;

public class LibraryUtil {
	public static void main(String[] args) {
		
		//String[] sectionsByAuthor = {"Abdul Kalam","Sudamurthi"};
		Library library=new Library("gangotri","xworkz","private");
		/*for(String sectionsByAuthor1 : sectionsByAuthor) {
			System.out.println(sectionsByAuthor1);*/
		
		System.out.println(library.name + " " +library.sectionsByAuthor+" " +library.type);
		
	}
		
	}


