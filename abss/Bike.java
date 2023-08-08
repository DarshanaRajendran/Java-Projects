package com.lumen.abss;

public class Bike extends Vehicle{

	

	public Bike(String model, String brand, double price) {
		super(model, brand, price);
	}

	@Override
	void getMileage() {
		System.out.println("50km");
	}

	@Override
	void showType() {
		if(this.model=="Hybrid") {
			System.out.println("This model is hybrid");
		}
		if(this.model=="Mountain") {
			System.out.println("This model is Mountain");
		}
		
	}
	void engineType() {
		System.out.println("");
	}

	
}
