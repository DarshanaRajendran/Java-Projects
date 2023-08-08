package com.lumen.abss;

public abstract class Vehicle {

	String model;
	String brand;
	double price;
	
	public Vehicle(String model, String brand, double price) {
		super();
		this.model=model;
		this.brand=brand;
		this.price=price;
	}
	void printDetails() {
		System.out.println("Model Name"+this.model);
		System.out.println("Brand Name"+this.brand);
		System.out.println("Price Name"+this.price);
	}
	
	abstract void getMileage();
	abstract void showType();
}
