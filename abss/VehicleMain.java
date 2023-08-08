package com.lumen.abss;

public class VehicleMain {

	public static void main(String[] args) {

		Vehicle vehicle = new Bike("Honda","RGV",234000);
		vehicle.printDetails();
		vehicle.getMileage();
		vehicle.showType();
		Bike bike = (Bike) vehicle;
		bike.engineType();
		
		Vehicle vehicle1 = new Car("Innova","Hondacity",70000,new String[] {"Cover","Freshner"});
		vehicle1.getMileage();
		vehicle1.printDetails();
		vehicle1.showType();
		Car car = (Car) vehicle1;
		car.showAccessories();
		
	}

}
