package com.lumen.overloading;

public class OverloadMain {

	public static void main(String[] args) {
	    
	    Employee employee = new Employee("Ravi", "Programmer");
		if(employee.designation.equalsIgnoreCase("programmer")) {
	    	System.out.println("Bonus: "+employee.calcBonus(500));
	    }
		if(employee.designation.equalsIgnoreCase("Manager")) {
			System.out.println("Bonus: "+employee.calcBonus(300,450));
	    }
		if(employee.designation.equalsIgnoreCase("Director")) {
			System.out.println("Bonus: "+employee.calcBonus(500,300,421));
	    }
	}

}
