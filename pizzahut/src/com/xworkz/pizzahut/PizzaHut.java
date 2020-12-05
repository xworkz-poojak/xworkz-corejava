package com.xworkz.pizzahut;

public class PizzaHut {
	
	public String address;
	public String typeOfPizzas;
	public double price;
	
	public PizzaHut()
	{
		this("jayanagar", "pastapizza",599.0);
		System.out.println("ending zero parametrised const");
	}
	
	public PizzaHut(String address,String typeOfPizzas,double price)
	{
		System.out.println("inside two parametrised const");
		this.address=address;
		this.typeOfPizzas=typeOfPizzas;
		this.price=price;
		System.out.println("ending two parametrised const");
	}
	
	public PizzaHut(double price)
	{
		this();
		System.out.println("inside one parametrised const");
		System.out.println(this.price);
		this.price=price;
		System.out.println("ending one paramtrised const");
	}

}
