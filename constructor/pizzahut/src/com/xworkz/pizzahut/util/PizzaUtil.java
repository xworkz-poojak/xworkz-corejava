package com.xworkz.pizzahut.util;

import java.util.Scanner;

import com.xworkz.pizzahut.PizzaHut;

public class PizzaUtil {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the address");
		String address=sc.next();
		System.out.println("enter the type of pizzas");
		String typeOfPizzas=sc.next();
		System.out.println("enter the price");
		double price=sc.nextDouble();
		sc.close();
		
		PizzaHut piza=new PizzaHut(address , typeOfPizzas, price);
		
		System.out.println(piza.address);
	}

}
