package com.xworkz.newspaper;

public class NewsPaper {
	
	public String information;
	public String articals;
	public int noOfPages;
	
	public String information(){
		return "information";
	}
	
	public NewsPaper(String information,String articals,int noOfPages){
		this.information=information;
		this.articals=articals;
		this.noOfPages=noOfPages;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public String getArticals() {
		return articals;
	}

	public void setArticals(String articals) {
		this.articals = articals;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	
	

}
