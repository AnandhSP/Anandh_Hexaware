package com.hexaware.concreteclasses;

import com.hexaware.abstractclasses.Vehicle;

public class Bike extends Vehicle {
	public Bike(String name, double rentalprice) {
		super(name, rentalprice);
	}
	public void rentVehicle() {
		if(isrented()) {
			setrented(true);
			System.out.println("you have rented this vehicle " + getname() + " sucessfully for Rs." + getrentalprice());
		}
		else {
			System.out.println("This vehicle " + getname() + " is already rented");
		}
	}
	public void returnVehicle() {
		if(isrented()) {
			setrented(false);
			System.out.println("This vehicle " + getname() + " has been returned sucessfully");
		}
		else {
			System.out.println("This vehicle " + getname() + " was not rented");
		}
	}

}
