package com.lumen.abss;

public class Car extends Vehicle{

	String accessories[];
	public Car(String model, String brand, double price,String[] accessories) {
		super(model, brand, price);
	    this.accessories=accessories;
	}

	@Override
	void getMileage() {
		System.out.println("70km");
	}

	@Override
	void showType() {
		if(this.model=="Innova") {
			System.out.println("This model is Innova");
		}
		if(this.model=="Celerio") {
			System.out.println("This model is Celerio");
		}
	}
	void showAccessories() {
		for(String accessory:accessories) {
			System.out.println("accessory");
		}
	}

	
	

}
